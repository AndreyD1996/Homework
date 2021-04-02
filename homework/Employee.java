package lesson4.homework;

public class Employee {
    private String name;
    private int age;
    private int number;
    private String job;
    private int salary;


    public Employee() {
        name = "Ivan";
        age = 35;
        number = 7999999;
        job = "manager";
        salary = 1000;
    }

    public Employee(String name, int age, int number, String job, int salary) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.job = job;
        this.salary = salary;


    }




    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getNumber() {
        return number;
    }
    public String getJob() {
        return job;
    }
    public int getSalary() {
        return salary;
    }




}
