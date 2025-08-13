//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in celsius : ");
        float t_c=sc.nextFloat();
        float t_f=(t_c * 9/5)+32;
        System.out.print("The temperature in fahrenheit is : "+t_f);
    }
}