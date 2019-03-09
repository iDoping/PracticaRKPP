import java.util.Scanner;
public class Practica23
{
    public static int function(int n) {

        if (n < 10)
        {
            return n;
        }
        else
        {
            return n % 10 + function(n / 10);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        System.out.print("Сумма цифр = ");
        System.out.print(function(n));
    }
}