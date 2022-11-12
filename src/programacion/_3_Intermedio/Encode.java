package programacion._3_Intermedio;

public class Encode {
    private String firstName;
    private String lastName;
    private String id;

    public Encode(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public Encode(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{"+"firstName= "+firstName+",\n" +
                "lastName="+lastName+",\n" +
                "id="+id+"}";




    }
}
