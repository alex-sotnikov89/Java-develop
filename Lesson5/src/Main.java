public class Main {

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan Ivanovich","Engineer","ivan@mail.com",
                "+74961111111", 72.5,40);
        empArray[1] = new Employee("Petrov Petr Petrovich","Engineer","petr@mail.com",
                "+74962222222", 65.0,35);
        empArray[2] = new Employee("Sidorov Ivan Ivanovich","Engineer","sidor@mail.com",
                "+74963333333", 60.7,45);
        empArray[3] = new Employee("Vasiliev Vasiliy Vasilich","Engineer","vasil@mail.com",
                "+74964444444", 50,60);
        empArray[4] = new Employee("Denisov Denis Denisovich","Engineer","denchik@mail.com",
                "+74965555555", 50,25);

        for (int i=0;i<empArray.length;i++){
            if (empArray[i].getAge()>40){
               empArray[i].showInfoEmployee();
                System.out.println("----------------------");
            }
        }

    }
}
