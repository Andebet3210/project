public class Person implements Nameable {
    int id;
    String name="unknown";
    int age;
    boolean parentPermission=true;

    public Person( String name, int age, boolean parentPermission) {
        this.name =name;
        this.age = age;
        this.parentPermission=parentPermission;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean of_age() {
        if (this.age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean can_use_services() {
        if (of_age() || this.parentPermission) {
            return true;
        } else {
            return false;
        }
    }
    public String getCorrectName(){
        return name;
    }

}