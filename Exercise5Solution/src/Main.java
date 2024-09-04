import model.Staff;
import model.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4521522, "Juan", "Sanchez", "juansanchez@gmail.com", "Dorrego 2050", 2018, 50000.0, "Programacion");
        Student student2 = new Student(7845211, "Maria", "Gomez", "mariagomez@gmail.com", "Belgrano 1234", 2019, 45000.0, "Matemáticas");
        Student student3 = new Student(3658412, "Pedro", "Lopez", "pedrolopez@gmail.com", "Mitre 5678", 2017, 52000.0, "Ingeniería");
        Student student4 = new Student(9521478, "Ricardo", "Martinez", "ricardomartinez@gmail.com", "Independencia 3200", 2021, 53000.0, "Física");


        Staff staff1 = new Staff(2023145, "Hector", "Quiroga", "quirogquiro@gmail.com", "Dorrego 4050", 250000.0, "mañana");
        Staff staff2 = new Staff(2034567, "Laura", "Martinez", "lauramartinez@gmail.com", "Belgrano 2234", 256700.0, "noche");
        Staff staff3 = new Staff(2047890, "Carlos", "Pérez", "carlosperez@gmail.com", "San Martín 1570", 450000.0, "mañana");
        Staff staff4 = new Staff(2051234, "Ana", "Rodriguez", "anarodriguez@gmail.com", "Rivadavia 7650", 225000.0, "noche");

        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Staff> staffList = new ArrayList<Staff>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        staffList.add(staff1);
        staffList.add(staff2);
        staffList.add(staff3);
        staffList.add(staff4);

        int studentCount = 0;
        int staffCount = 0;


        for (Object person : studentList) {
            if (person instanceof Student) {
                studentCount++;
            }
        }

        for (Object person : staffList) {
            if (person instanceof Staff) {
                staffCount++;
            }
        }

        // Mostrar los resultados
        System.out.println("The number of students is: " + studentCount);
        System.out.println("The number of staff members is: " + staffCount);

        double totalIncomes = 0.0;

        for (Object person : studentList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                totalIncomes += student.getMonthlyFee();
            }
        }
        System.out.println("Total income from student fees: $" + totalIncomes);
    }
}