import java.util.Scanner;
public class Practica22
{
    public static boolean function(int n)
    {
       for (int i = 2; i < n; i++)
       {
           if (n%i == 0)
           {
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args)
    {
        int num = 10000;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        System.out.println(function(n));


        for (int i = 0; i< num; i++) {
            if (function(i) == true) {
                System.out.println(i + " ");
            }
        }
    }
}