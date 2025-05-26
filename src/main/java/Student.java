//USE @OVERRIDE. ITS NOT NEEDED BUT IT SHOULD BECOME A HABIT 
// this code is like, almost the same as the cow class
public class Student {
    private String name;
    private int age;
    private String studentNumber;

    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return name + ", " + age + " - " + studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentNumber.equals(student.studentNumber);
    }
}
