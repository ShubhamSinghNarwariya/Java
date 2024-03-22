import java.util.*;
public class diffrence{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1st number");
    int a = sc.nextInt();
    System.out.println("Enter 2nd number");
    int b = sc.nextInt();

    if (a>b)
         { 
        System.out.println("a is grater ");
        int diffrence = a-b;
        System.out.println(diffrence);
   }
        else{
        System.out.println(" b is grater");
        int diffrence = b-a;
        System.out.println(diffrence);
}

}
    
}