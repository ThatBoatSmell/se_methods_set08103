package com.napier.sem;

import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        // Connection to the database
        Connection con = null;
        int retries = 10;

        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start - MOVED HERE
                Thread.sleep(3000);

                // Connect to database
                if(args.length == 1) {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:33060/employees?allowPublicKeyRetrieval=true&useSSL=false", "root", "example");
                }
                else {
                    con = DriverManager.getConnection("jdbc:mysql://db:3306/employees?allowPublicKeyRetrieval=true&useSSL=false", "root", "example");
                }
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }

        if (con != null)
        {
            try
            {
                // Create an SQL statement
                Statement stmt = con.createStatement();

                // Create string for SQL statement
                String strSelect =
                        "SELECT emp_no, first_name, last_name "
                                + "FROM employees "
                                + "WHERE last_name = 'Christ' "
                                + "ORDER BY emp_no ASC";

                // Execute SQL statement
                ResultSet rset = stmt.executeQuery(strSelect);

                // Print header
                System.out.println("\nEmployees with last name 'Christ':");
                System.out.println("----------------------------------");

                // Process the results
                while (rset.next())
                {
                    int emp_no = rset.getInt("emp_no");
                    String first_name = rset.getString("first_name");
                    String last_name = rset.getString("last_name");

                    System.out.println(emp_no + " " + first_name + " " + last_name);
                }

                // Close result set
                rset.close();
                stmt.close();
            }
            catch (Exception e)
            {
                System.out.println("Error executing query");
                System.out.println(e.getMessage());
            }

            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
}