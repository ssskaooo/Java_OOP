package seminars.lesson3and4;

public class Student extends User implements Comparable<Student>{

    private Integer studentId;


    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        if(studentId > o.studentId){
//            return 1;
//        }
//        if(studentId < o.studentId){
//            return -1;
//        }
//        return 0;
        return studentId.compareTo(o.studentId);
    }
}
