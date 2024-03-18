import java.util.*;
class Average{
    public static void main(String arr[]){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=ob.nextInt();

        System.out.print("Enter another number:");
        int b=ob.nextInt();

        System.out.print("Enter one another number:");
        int c=ob.nextInt();

        int Average=((a+b+c)/2);
        System.out.println("Average of three numbers:"+Average);
    }
}
