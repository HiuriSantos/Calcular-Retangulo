import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.printf("Length: ");
        double length = scanner.nextDouble();
        System.out.printf("Width: ");
        double width = scanner.nextDouble();
        try {
            rectangle.setLength(length);
            rectangle.setWidth(width);
        }
        catch (ArgumentException e){
            System.out.printf("Valores fora do Limite entre 0.0 e 20.0\n");
        }
        System.out.println("Length = " + rectangle.getLength());
        System.out.println("Width = " + rectangle.getWidth());

    }
}
