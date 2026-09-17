package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Manager m = new Manager("Amanda", 80000, 5000);
    }
}

// 3: John, 80000.0, 5000.0, 13000.0

// 4: Employee, then Manager. We create an Employee, then a Manager that extends it

// 5. Private is safer as only the Employee class can modify the values

// 6. I'd use Private for a real payroll method.
// As a real life example, Protected would mean the managers can directly increase
// their own salaries by a massive amount. Private means the raise is fixed for all employees.
// This also validates no negative values are used.

// 7. A protected method allows data to not be directly viewed as compared to
// a protected field

// 8. Again, we don't want direct access to the data as that could be exploited

// 9. The 2nd one changes a different employee's salary, while the first one changes
// the manager's own salary. The 2nd one also doesn't work as the two are in different
// packages.

// 10. This compiles due to Protected fields needing to be in the same package when not
// a subclass or superclass