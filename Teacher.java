public class Teacher extends Person {
    private String specialization;

    public Teacher(int id, String name, int age, boolean parentPermission, String specialization) {
        super( name, age, parentPermission);
        this.specialization = specialization;
    }


    @Override
    public boolean can_use_services() {
        return true;
    }

    public String getSpecialization() {
        return specialization;
    }
}