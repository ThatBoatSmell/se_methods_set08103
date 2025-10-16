# USE CASE: 6 Produce a Report on employee details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to view an employee's details so that the employee's promotion request can be supported.
### Scope

Company.

### Level

Primary task.

### Preconditions

We know the role.  Database contains current employee salary data.

### Success End Condition

A report is available for HR to support employees promotion request.

### Failed End Condition

No report is produced.

### Primary Actor

HR Advisor.

### Trigger

A request for employee information is sent to HR.

## MAIN SUCCESS SCENARIO

1. HR advisor request information for all specific employee.
2. HR advisor extracts current information of specific employees.
3. HR advisor provides report.

## EXTENSIONS

3. **Role does not exist**:
    1. HR advisor informs finance no role exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
