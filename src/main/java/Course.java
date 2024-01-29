public class Course {
    private int ID;
    private String Name;
    private String Code;

    // Default constructor
    public Course() {

    }

    // Overloaded constructor
    public Course(int ID, String Name, String Code) {
        this.ID = ID;
        this.Name = Name;
        this.Code = Code;
    }

    // Getter and Setter methods for each data member
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}