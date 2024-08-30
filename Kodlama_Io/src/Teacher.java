import java.util.List;

public class Teacher {

    private int id;
    private String name;
    private String imgPath;
    private List<Course> courses;

    public Teacher(int id, String name, String imgPath, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.imgPath = imgPath;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", courses=" + courses +
                '}';
    }
}
