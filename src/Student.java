public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemical;
    double avarage;
    boolean isPass;


    public Student(String name, int classes, String stuNo, Course math,Course physics,Course chemical) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemical = chemical;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int physics, int chemical, int speakMath, int speakPhysics, int speakChemical) {

        if (mat >= 0 && mat <= 100) {
            this.math.note = mat;
            this.math.speakNote = speakMath;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
            this.physics.speakNote = speakPhysics;
        }

        if (chemical >= 0 && chemical <= 100) {
            this.chemical.note = chemical;
            this.chemical.speakNote = speakChemical;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemical.note == 0) {
            System.out.println("Grades not fully entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.avarage);
            if (this.isPass) {
                System.out.println("Passed the class. ");
            } else {
                System.out.println("Failed in Class.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.physics.note * this.physics.notePercent) + (this.physics.speakNote * this.physics.speakNotePercent))
                + ((this.chemical.note * this.chemical.notePercent) + (this.chemical.speakNote * this.chemical.speakNotePercent)) +
                ((this.math.note * this.math.notePercent) + (this.math.speakNote * this.math.speakNotePercent))) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.math.note);
        System.out.println("Math Speak Note : " + this.math.speakNote);
        System.out.println("Physics Note : " + this.physics.note);
        System.out.println("Physics Speak Note : " + this.physics.speakNote);
        System.out.println("Chemical Note : " + this.chemical.note);
        System.out.println("Chemical Speak Note : " + this.chemical.speakNote);
    }

}
