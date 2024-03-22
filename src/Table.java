import java.util.*;
public class Table {
    public static void main(String []arr){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=ob.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
