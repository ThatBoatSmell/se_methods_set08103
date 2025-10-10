# USE CASE: 5 Add new employee details

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to add a new employee's details so that I can ensure the new employee is paid.
### Scope

Company.

### Level

Primary task.

### Preconditions

We know the role. We know the details of new employee. Database contains current employee salary data.

### Success End Condition

New employee added to database and is successfully paid

### Failed End Condition

New employee not added to database and is not paid

### Primary Actor

HR Advisor.

### Trigger

A request to add new employee details is sent to HR.

## MAIN SUCCESS SCENARIO

1. HR advisor provides new employee details.
2. Finance adds new employee details to database.

## EXTENSIONS

3. **Role does not exist**:
    1. HR advisor informs finance no role exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
