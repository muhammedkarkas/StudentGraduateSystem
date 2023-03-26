public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "MAT101", "MAT", 0.8, 0.2);
        Course physics = new Course("Physics", "PHY101", "PHY", 0.9, 0.1);
        Course chemical = new Course("Chemical", "CHC101", "CHC", 0.7,0.3);

        Teacher t1 = new Teacher("Jack", "90550000000", "MAT");
        Teacher t2 = new Teacher("Elena", "90550000001", "PHY");
        Teacher t3 = new Teacher("Micheal", "90550000002", "CHC");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemical.addTeacher(t3);

        Student s1 = new Student("John Doe", 4, "140144015", math, physics, chemical);
        s1.addBulkExamNote(30,40,40,70,80,75);
        s1.isPass();


    }
}