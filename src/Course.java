public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Process Successful");
        } else {
            System.out.println(t.name + " Academician cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " academician of the course : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " No Academician has been assigned to the course..");
        }
    }

}

