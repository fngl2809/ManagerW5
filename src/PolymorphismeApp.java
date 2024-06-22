public class PolymorphismeApp {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Anggi");
        employee.sayHello("Fakhri");
        //   set Manager
        employee = new Manager("Anggi");
        employee.sayHello("Fakhri");
        // set VP
        employee = new VicePresident("Anggi");
        employee.sayHello("Fakhri");
    }   
}
