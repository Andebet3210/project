 //this is Teacher class extends from person
public class Teacher extends Person {
    private String specialization;

    public Teacher(int id, String name, int age, boolean parentPermission, String specialization) {
        super( name, age, parentPermission);
        this.specialization = specialization;
    }

  
}
