/**
 * Главный класс программы, демонстрирующий работу с массивом объектов класса Student.
 */
public class Main {
    /**
     * Главная функция программы.
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        /**
         * Массив объектов класса Student, содержащий информацию о нескольких студентах.
         */
        Student[] students = {
                new Student(16, "Маргарита", "904-850-74-29", 1, "Медицинский факультет", 2019),
                new Student(25, "Иван", "904-853-94-56", 5, "Биологический факультет", 2009),
                new Student(17, "Игорь", "904-841-73-11", 2, "Физический факультет", 2022),
        };
        System.out.println("Список всех студентов:");
        /**
         * Цикл for-each для вывода информации о всех студентах.
         */
        for (Student student : students) {
            System.out.println(student.Name + " " + student.getAge() + " лет");
        }
        System.out.println();

        System.out.println("Список студентов Медицинского факультета:");
        /**
         * Цикл for-each для вывода информации о студентах Медицинского факультета.
         */
        for (Student student : students) {
            if (student.Faculty == "Медицинский факультет") {
                System.out.println(student.Name);
            }
        }
        System.out.println();

        System.out.println("Список студентов, поступивших после 2009 года:");
        /**
         * Цикл for для вывода информации о студентах, поступивших после 2009 года.
         */
        for (int i = 0; i < students.length; i++) {
            if (students[i].getDateOfReceipt() > 2009) {
                System.out.println(students[i].Name);
            }
        }
    }
}

/**
 * Класс Person, представляющий человека.  Служит базовым классом для Student.
 */
class Person {
    private int Age;
    /**
     * Имя человека.
     */
    public String Name;
    /**
     * Номер телефона человека.
     */
    public String PhoneNumber;
    /**
     * Конструктор класса Person.
     * @param Age Возраст человека.
     * @param Name Имя человека.
     * @param PhoneNumber Номер телефона человека.
     */
    Person(int Age, String Name, String PhoneNumber){
        this.Age = Age;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
    }
    /**
     * Возвращает возраст человека.
     * @return Возраст человека.
     */
    public int getAge(){
        return Age;
    }

}

/**
 * Класс Student, представляющий студента.  Расширяет класс Person.
 */
class Student extends Person {
    /**
     * Курс студента.
     */
    int Course;
    /**
     * Факультет студента.
     */
    String Faculty;
    private int DateOfReceipt;
    /**
     * Конструктор класса Student.
     * @param Age Возраст студента.
     * @param Name Имя студента.
     * @param PhoneNumber Номер телефона студента.
     * @param Course Курс студента.
     * @param Faculty Факультет студента.
     * @param DateOfReceipt Год поступления студента.
     */
    Student(int Age, String Name, String PhoneNumber, int Course, String Faculty, int DateOfReceipt) {
        super(Age, Name, PhoneNumber);
        this.Course = Course;
        this.Faculty = Faculty;
        this.DateOfReceipt = DateOfReceipt;
    }

    /**
     * Возвращает год поступления студента.
     * @return Год поступления студента.
     */
    public int getDateOfReceipt() {
        return DateOfReceipt;
    }
}
