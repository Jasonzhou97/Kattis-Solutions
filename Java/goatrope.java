import java.util.Scanner;

public class goatrope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pointX = sc.nextDouble();
        double pointY = sc.nextDouble();
        double rectX1 = sc.nextDouble();
        double rectY1 = sc.nextDouble();
        double rectX2 = sc.nextDouble();
        double rectY2 = sc.nextDouble();

         // Calculate the distance
         double distance = 0.0;
         if (pointX < rectX1) {
             if (pointY < rectY1) {
                 // Point is closest to bottom-left corner of rectangle
                 distance = Math.sqrt((pointX - rectX1)*(pointX - rectX1) + (pointY - rectY1)*(pointY - rectY1));
             } else if (pointY > rectY2) {
                 // Point is closest to top-left corner of rectangle
                 distance = Math.sqrt((pointX - rectX1)*(pointX - rectX1) + (pointY - rectY2)*(pointY - rectY2));
             } else {
                 // Point is closest to left edge of rectangle
                 distance = rectX1 - pointX;
             }
         } else if (pointX > rectX2) {
             if (pointY < rectY1) {
                 // Point is closest to bottom-right corner of rectangle
                 distance = Math.sqrt((pointX - rectX2)*(pointX - rectX2) + (pointY - rectY1)*(pointY - rectY1));
             } else if (pointY > rectY2) {
                 // Point is closest to top-right corner of rectangle
                 distance = Math.sqrt((pointX - rectX2)*(pointX - rectX2) + (pointY - rectY2)*(pointY - rectY2));
             } else {
                 // Point is closest to right edge of rectangle
                 distance = pointX - rectX2;
             }
         } else {
             if (pointY < rectY1) {
                 // Point is closest to bottom edge of rectangle
                 distance = rectY1 - pointY;
             } else if (pointY > rectY2) {
                 // Point is closest to top edge of rectangle
                 distance = pointY - rectY2;
             } else {
                 // Point is inside the rectangle
                 distance = 0.0;
             }
         }
 
         // Print the result
         System.out.println(distance);
     }
 }

 
 
 
    

