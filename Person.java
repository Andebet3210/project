public class Person {
    private int id;
    private String name;
    private int age;
    private boolean parentPermission;

    public Person( String name, int age, boolean parentPermission) {
        this.name = "unknown";
        this.age = age;
        this.parentPermission = true;
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

}

