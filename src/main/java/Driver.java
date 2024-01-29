public class Driver {

    public static void main(String[] args) {
        Course course = new Course(2150396,"Data Structures & Algorithms I","CSC229");

        // Use the setter methods to change the ID, Name, and Code
        course.setID(2150396);
        course.setName("Data Structures & Algorithms I");
        course.setCode("CSC229");

        // Print the updated values
        System.out.println("ID: "+course.getID());
        System.out.println("Name: "+course.getName());
        System.out.println("Code: "+course.getCode());
    }
}
