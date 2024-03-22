import java.util.*;
public class cpsp{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price");
        int cp = sc.nextInt();
        System.out.println("enter selling price");
        int sp = sc.nextInt();
        if(sp>cp)
        { 
            System.out.println("profit");
            int profit=sp-cp;
            System.out.println(profit);
        }
        else
        { 
            System.out.println("loss");
            int loss = cp-sp;
            System.out.println(loss);
            
        }
    }

}