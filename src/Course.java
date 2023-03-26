public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note;
    double speakNote;
    double notePercent;
    double speakNotePercent;

    public Course(String name, String code, String prefix,double notePercent, double speakNotePercent) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.speakNote = 0;
        this.notePercent = notePercent;
        this.speakNotePercent = speakNotePercent;
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

