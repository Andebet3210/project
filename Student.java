//student class extends from person

 public class Student extends Person {
    private String classroom;


     public Student(int id, String name, int age, boolean parentPermission, String classroom) {
        super( name, age, parentPermission);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setclassroom(Classroom classroom) {
        this.classroom= String.valueOf(classroom);
        classroom.addStudent(this);
    }

    public void setClassroom(Classroom classroom) {
    }
}