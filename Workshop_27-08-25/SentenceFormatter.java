import java.util.*;
public class SentenceFormatter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a paragraph : ");
        String para = sc.nextLine();
        String format = "";
        String[] arr = para.split(" ");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        for(int i = 0 ;i<arr.length;i++){
            if(i==0){
                format += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1)+" ";
            } else if(arr[i].equals(",") || arr[i].equals(".") || arr[i].equals("?") || arr[i].equals("!")){
                format += arr[i]+" "+arr[i+1].substring(0, 1).toUpperCase() + arr[i+1].substring(1)+" ";
                arr[i]=arr[i++];
            }else{
                format+=arr[i]+" ";
            }
        }
        System.out.print(format.trim());
    }
}
