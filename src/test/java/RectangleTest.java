import static org.junit.Assert.*;
import java.util.Scanner;
public class RectangleTest {
       public static void main(String[] args) {
                      Scanner scanL = new Scanner (System.in);
            System.out.println("Please enter the length of the rectangle: ");
            double L = scanL.nextDouble();
            Scanner scanW = new Scanner (System.in);
            System.out.println("Please enter the length of the rectangle: ");
            double W = scanW.nextDouble();
            double RectangleArea;
            Rectangle unitRectangle = new Rectangle();
            RectangleArea = unitRectangle.FindArea();
            System.out.println("The area of a unit rectangle is " + RectangleArea);
            double RectanglePermiter;
            Rectangle perimRectangle = new Rectangle();
            RectanglePermiter = perimRectangle.FindPerim();
            System.out.println("The permimiter of the unit rectangle is " + RectanglePermiter);
        }

}