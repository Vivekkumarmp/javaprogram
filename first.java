 import java .util.Scanner;
 class  Main
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner (System.in);
                System.out.println("enter the length");
        int L =sc.nextInt();
        System.out.println("enter the bredth");
        int B = sc.nextInt();
        int perimeter = 2 *(L+B);
        System.out.println (" perimeter of rectangle ="+ perimeter);

    }
}
