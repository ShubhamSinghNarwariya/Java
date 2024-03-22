import java.util.*;
public class pair {
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter number of guest: ");
    int n = sc.nextInt();
        if(n%2==0){
             System.out.println("All guest are in pair");
         } 
        else{
             System.out.println("Some one is there is sigle person");
        }
    }

}