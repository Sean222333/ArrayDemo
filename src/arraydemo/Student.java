
package arraydemo;

/**
 *
 * @author Sheng
 */
public class Student {
    //add some comments for fetch;
    //add comments for PULL
    private String studentId;
    private String studentName;
    private String studentNum;
    

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    
    
}
