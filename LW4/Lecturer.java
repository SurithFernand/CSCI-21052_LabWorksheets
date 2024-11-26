import java.util.ArrayList;

public class Lecturer extends Person{
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching = new ArrayList<>();

    public Lecturer(String name, String position  /*, Department department, ArrayList<Course> coursesTeaching  */ ) {
        super(name);
        this.position = position;
//        this.department = department;
//        this.coursesTeaching = coursesTeaching;
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer: " + getName());
        System.out.println("Position: " + position);
//        System.out.println("Department: " + department);
//        for(Course course : coursesTeaching){
//            System.out.println(course);
//        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo(){
        System.out.println("Department: " + department);
    }

    public void addCourse(Course course){
        coursesTeaching.add(course);
    }

    public void removeCourse(String name){
        for(Course course : coursesTeaching){
            if(course.getName().equals(name)){
                coursesTeaching.remove(course);
            }
        }
    }

    public void listCoursesTeaching(){
        //System.out.println("Course taught by " + getName() + ":");
        for(Course course : coursesTeaching){
            System.out.println(course);
        }
    }



}
