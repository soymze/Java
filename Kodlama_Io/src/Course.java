import java.util.List;
public class Course {

    private int id;
    private String name;
    private Teacher teacher;
    private int price;
    private String description;
    private String imgPath;
    private Category category;

    public Course(int id, String name, Teacher teacher, int price, String description, String imgPath, Category category) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.price = price;
        this.description = description;
        this.imgPath = imgPath;
        this.category = category;
    }

    public Course(int id, String name, int price, String description, String imgPath) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgPath = imgPath;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", category=" + category +
                '}';
    }
}
