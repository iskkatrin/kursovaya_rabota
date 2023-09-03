public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Inna Breduk", 1, 1000);
        Employee employee2 = new Employee("Katy Larina", 2, 2000);
        Employee employee3 = new Employee("Mary Rodionova", 3, 3000);
        Employee employee4 = new Employee("Vita Kosenko", 4, 4000);
        Employee employee5 = new Employee("Luba Kievec", 5, 5000);

        System.out.println(employee1.getId());
        System.out.println(employee2.getId());
        System.out.println(employee3.getId());
        System.out.println(employee4.getId());
        System.out.println(employee5.getId());

        System.out.println(employee1.getFullName());
        System.out.println(employee2.getFullName());
        System.out.println(employee3.getFullName());
        System.out.println(employee4.getFullName());
        System.out.println(employee5.getFullName());

        System.out.println(employee1.getDepartment());
        System.out.println(employee2.getDepartment());
        System.out.println(employee3.getDepartment());
        System.out.println(employee4.getDepartment());
        System.out.println(employee5.getDepartment());

        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println(employee3.getSalary());
        System.out.println(employee4.getSalary());
        System.out.println(employee5.getSalary());

        Employee [] employees = new Employee[10];

        employees [0] = new Employee("Inna Breduk", 1, 1000);
        employees [1] = new Employee("Katy Larina", 2, 2000);
        employees [2] = new Employee("Mary Rodionova", 3, 3000);
        employees [3] = new Employee("Vita Kosenko", 4, 4000);
        employees [4] = new Employee("Luba Kievec", 5, 5000);

        Employee.getAllEmployees(employees);

    }
}
