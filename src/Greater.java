import java.util.*;
class Greater{
    public static void main(String []arr){
        Scanner ob=new Scanner(System.in);

        System.out.print("Enter a number=");
        int a=ob.nextInt();

        System.out.print("Enter another number=");
        int b=ob.nextInt();

        if(a==b){
            System.out.println(a+" and "+b+" both are equal");
        }
        else if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else {
            System.out.println(a+" is lesser than "+b);
        }
    }
}

