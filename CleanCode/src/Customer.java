
public class Customer implements IEntity{
    public int Id;
    public String name;
    public boolean IsStudent;
    public boolean IsOfficer;

    public Customer(int id, String name, boolean isStudent, boolean isOfficer) {
        Id = id;
        this.name = name;
        IsStudent = isStudent;
        IsOfficer = isOfficer;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStudent() {
        return IsStudent;
    }

    public void setStudent(boolean student) {
        IsStudent = student;
    }

    public boolean isOfficer() {
        return IsOfficer;
    }

    public void setOfficer(boolean officer) {
        IsOfficer = officer;
    }
}
