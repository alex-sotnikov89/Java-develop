public class Employee {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String telephone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void showInfoEmployee() {
        System.out.println("Сотрудник \nФИО: " + this.name + ";");
        System.out.println("Возраст: " + this.age + ";");
        System.out.println("Должность: " + this.position + ";");
        System.out.println("Зарплата: " + this.salary + ";");
        System.out.println("Телефон: " + this.telephone + ";");
        System.out.println("email: " + this.email + ";");
    }

    public int getAge() {
        return age;
    }
}
