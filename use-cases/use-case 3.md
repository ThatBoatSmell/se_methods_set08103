# USE CASE: 3 Produce a Report on the Salary of all Employees in a given department

## CHARACTERISTIC INFORMATION

### Goal in Context

As department manager I want to produce a report on the salary of all employees in my department so that I can support financial reporting of my department.
### Scope

Company.

### Level

Primary task.

### Preconditions

We know the role.  Database contains current employee salary data.

### Success End Condition

A report is available for department manager to provide to finance.

### Failed End Condition

No report is produced.

### Primary Actor

Department Manager.

### Trigger

A request for finance information is sent to HR.

## MAIN SUCCESS SCENARIO

1. Department Manager request salary information for a given department.
2. HR advisor captures name of the department to get salary information for.
3. HR advisor extracts current salary information of all employees of the given department.
4. HR advisor provides report to finance.

## EXTENSIONS

3. **Role does not exist**:
    1. HR advisor informs finance no role exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
