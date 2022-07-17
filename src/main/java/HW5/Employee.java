package HW5;

public class Employee {
    String name;
    int phoneNumber;
    String email;
    String position;
    int salary;
    int age;


    public Employee(String name, int phoneNumber, String email, String position, int salary, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Имя сотрудника: " + name);
        System.out.println("Контактная информация: " + phoneNumber + " " + email);
        System.out.println("Должность: " + position + " зарплата: " + salary + " возраст: " + age );


    }
}
