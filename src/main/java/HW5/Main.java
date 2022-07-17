package HW5;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee("Вася", 111111, "1@job.ru", "boss", 1000, 47);
//        employee.printInfo();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jonh", 1111, "1111@jib.com", "bigboss", 10000, 55);
        employees[1] = new Employee("Steve", 2222, "2222@jib.com", "boss", 1000, 40);
        employees[2] = new Employee("Sam", 3333, "3333@jib.com", "worker", 500, 30);
        employees[3] = new Employee("Frodo", 4444, "4444@jib.com", "courier", 10, 25);
        employees[4] = new Employee("Bilbo", 5555, "5555@jib.com", "honorary worker", 15, 75);

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].age >= 40){
                employees[i].printInfo();
            }

        }

    }


}
