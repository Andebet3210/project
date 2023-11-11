// this is Student class extends from person
public class Student extends Person {
    private String classroom;

    public Student(int id, String name, int age, boolean parentPermission, String classroom) {
        super( name, age, parentPermission);
        this.classroom = classroom;
    }

  
    
}
