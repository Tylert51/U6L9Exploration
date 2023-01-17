import java.util.Arrays;

public class ClassroomTester
{
    public static void main (String[] args)
    {
        Classroom classroom = new Classroom(10);

        Student ada = new Student("Ada", "Lovelace", new int[] {85, 86, 90});
        Student alan = new Student("Alan", "Turing", new int[] {90, 92, 95, 91});
        Student carrie = new Student("Carrie", "Underwood", new int[] {88, 88, 91, 100, 95});
        Student eleanor = new Student("Eleanor", "Rigby", new int[] {97, 99});

        classroom.addStudent(ada);
        classroom.addStudent(alan);
        classroom.addStudent(carrie);
        classroom.addStudent(eleanor);

        classroom.printRoster();

        double average = classroom.classExamAverage();
        System.out.println(average);

        System.out.println("-------");

        Student frankie = new Student("Frankie", "Archer", new int[] {78, 82, 80});
        classroom.addStudent(frankie);
        classroom.printRoster();

        double updatedAverage = classroom.classExamAverage();
        System.out.println(updatedAverage);

        System.out.println("-------");
        System.out.println(Arrays.toString(classroom.getClassRoster()));
    }
}