import java.util.ArrayList;

public class Main {

    static ArrayList<Category> categoryList = new ArrayList<>();
    static ArrayList<Course> courseList = new ArrayList<>();

    public static void main(String[] args) {

        Category category1 = new Category(1,"Programlama");
        categoryList.add(category1);

        Course course1 = new Course(1,"C#", 10,"Falan filan", "www.img1.com/asd1");
        course1.setCategory(category1);
        courseList.add(course1);

        ArrayList<Course> category1_Courses = getCoursesByCategory(category1);

        Teacher teacher1 = new Teacher(1, "Engin Demiroğ", "www.img1.com/asd", courseList);
    }

    private static ArrayList <Course> getCoursesByCategory(Category category){
        ArrayList<Course> result = new ArrayList<>();
        for(Course course:courseList){
                if(course.getCategory().getId() == category.getId()){
                    result.add(course);
                }
            }
        return result;
    }
}