public class Student {
    private int StudentId;
    private String studentName;
    private String studentAddress;

    public Student() {
    }

    public Student(int studentId, String studentName, String studentAddress) {
        StudentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}
