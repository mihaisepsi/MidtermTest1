import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        System.out.println("Enter Side of Square:");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        double area = side*side;
        double perimeter = side*4;
        System.out.println("Area of Square is: "+area);
        System.out.println("Perimeter of Square is:" +perimeter);
        }
    }
