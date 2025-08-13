import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the existing circle : ");
        float r=sc.nextFloat();
        double area=3.14 * Math.pow(r,2);
        System.out.print("The area of the circle is : "+area+" sq.units");
    }
}