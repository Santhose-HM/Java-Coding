package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class CustomSortingRealExample {
    public static void main(String[] args) {
        ArrayList<Student> studentList = getStudents();

        System.out.println(studentList);


        System.out.println("Sort Students by Marks");
        Collections.sort(studentList,(valueOne,valueTwo)->valueOne.marks-valueTwo.marks);
        System.out.println(studentList);

        System.out.println("Sort Students by Name");
        Collections.sort(studentList,(valueOne,valueTwo)->valueOne.name.compareTo(valueTwo.name));
        System.out.println(studentList);


        System.out.println("Sort Students by Multilevel Sort");
        Collections.sort(studentList,(valueOne,valueTwo)->{
            if(valueOne.marks>valueTwo.marks){
                return valueOne.marks-valueTwo.marks;
            }
            return valueOne.name.compareTo(valueTwo.name);
        } );
        System.out.println(studentList);

    }

    private static ArrayList<Student> getStudents() {
        ArrayList<Student> studentList = new ArrayList<>();
        Student studentOne = new Student(
                1,
                "Santhose",
                78
        );
        Student studentTwo = new Student(
                2,
                "Hayagreevan",
                100
        );
        Student studentThree = new Student(
                3,
                "Santhosh Kumar",
                85
        );
        Student studentFour = new Student(
                4,
                "Harsha",
                90
        );
        Student studentFive = new Student(
                5,
                "Nhiranjan",
                80
        );


        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);
        studentList.add(studentFour);
        studentList.add(studentFive);
        return studentList;
    }
}


class  Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}
