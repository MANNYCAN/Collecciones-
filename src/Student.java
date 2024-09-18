import java.util.ArrayList;
import java.util.List;

public class Student{
    String name;
    String id;
    List<Course> enrolledCourses = new ArrayList<>(  );

    public Student( String name, String id ){
        this.name = name;
        this.id = id;
    }//public students

    public String getName(){
        return name;
    }//public students

    public void setName( String name ){
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public void enroll(Course course){
        enrolledCourses.add( course );
    }

    public void unEnroll(Course course){
        enrolledCourses.remove( course );
    }//unenroll
    
    
    public int totalEnrolledCourses(){
        //TODO implement
        return enrolledCourses.size();
    }//toalenrolledcuses

    public List<Course> getEnrolledCourses()
    {
        return enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", enrolledCourses=" + enrolledCourses
            + '}';
    }
}