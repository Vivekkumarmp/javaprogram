import java.util.Scanner; // scanner is a class
public class Main{// class body

    public static void main(String [] args){ // main function
     Scanner sc = new Scanner(System.in);// sc  is a object
        System.out.println("Enter Number ");
        int x = sc.nextInt();
//        System.out.println("Your value " + x);
        System.out.println("Enter Second Number ");
        int y = sc.nextInt();
        System.out.println(x+y);
        System.out.println(x*y);

    }


}
