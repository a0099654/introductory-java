import java.util.Objects;

public class TriangleTestDrive {
    public static void main (String[] args){
        Triangle triangle = new Triangle();

        System.out.println("Exercise 1");
        System.out.println(triangle.easyExercise());

        System.out.println("Exercise 2");
        System.out.println(triangle.horizontalLine(8));

        System.out.println("Exercise 3");
        System.out.println(triangle.verticalLine(3));

        System.out.println("Exercise 4");
        System.out.println(triangle.buildTriangle(9));
    }
}
