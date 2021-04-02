package lesson4.homework;

public class MainClass {
    public static void main(String[] args) {
        Employee newEmployee = new Employee("Boris", 48, 77889477, "manager", 3000);


        System.out.println(newEmployee.getName() + " , " + newEmployee.getJob());
        System.out.println("_________________");

        Employee[] employees = {

                new Employee("Arkadii", 40, 7999998, "product manager", 6500),
                new Employee("Evgenii", 31, 79998889, "engineer", 4800),
                new Employee("Aleksei", 50, 79998549, "assistant", 3800),
                new Employee("Dmitrii", 31, 79998349, "engineer", 4800),
                new Employee("Vlad", 38, 799329, "manager", 3000)

        };

        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].getName()
                        + ", " + employees[i].getAge()
                        + ", " + employees[i].getNumber()
                        + ", " + employees[i].getJob()
                        + ", " + employees[i].getSalary());
            }








    }
}
