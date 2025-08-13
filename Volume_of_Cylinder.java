import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder : ");
        float r=sc.nextFloat();
        System.out.print("Also enter the height of the same cylinder : ");
        float h=sc.nextFloat();
        double area = 3.14 * Math.pow(r,2) * h;
        System.out.print("The area of the cyliner is : "+area+" sq. units");
    }
}