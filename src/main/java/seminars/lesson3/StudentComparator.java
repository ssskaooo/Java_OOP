package seminars.lesson3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.secondName.compareTo(o2.secondName);
        if(resultOfComparing == 0) {
            resultOfComparing = o1.firstName.compareTo(o2.firstName);
            if (resultOfComparing == 0) {
                return o1.lastName.compareTo(o2.lastName);
            } else {
                return resultOfComparing;
            }
        }else {
            return resultOfComparing;
        }
    }
}
