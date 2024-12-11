package OOPS.Inheritance.Single;

class Employee {
    String name;
    int employeeId;

    void work() {
        System.out.println(name + " is working.");
    }
}

// Child Class
class Manager extends Employee {
    void manageTeam() {
        System.out.println(name + " is managing the team.");
    }
}

// Main Class
class SingleInheritanceExample {
    public static void main(String[] args) {
        Manager manager = new Manager();

        // Setting properties from the Parent class
        manager.name = "Alice";
        manager.employeeId = 101;

        // Calling methods from both Parent and Child classes
        manager.work();        // Inherited from Employee class
        manager.manageTeam();  // Defined in Manager class
    }
}
