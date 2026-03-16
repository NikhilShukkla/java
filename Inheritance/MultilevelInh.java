class Person {
    String name;
    public void showName() {
        System.out.println("Name is : " + name);
    }
}
class Employee extends Person {
    int salary;
    public void showSalary() {
        System.out.println("Persons salary is : " + salary);
    }
}
class Manager extends Employee {
    String department;
    public void showDept() {
        System.out.println("Department is : " + department);
    }
}

class MultilevelInh {
    public static void main(String args[]){
        Manager m1 = new Manager();
        m1.name = "Nikhil";
        m1.salary = 100000;
        m1.department = "IT";

        m1.showName();
        m1.showSalary();
        m1.showDept();
    }
}
