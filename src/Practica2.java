import java.util.Scanner;
public class Practica2
{
    public static int function(double a,int b)
    {
       int result = 0;
        switch (b)
        {
            case 1: result = (int)Math.floor(a);
                break;
            case 2:  result = (int)Math.ceil(a);
                break;
            case 3:  result = (int)Math.round(a);
                break;
                default:result = 0;
        }
       return result;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, которое нужно округлить: ");
        double a = in.nextDouble();
        System.out.print("Каким из 3 способов вы хотите округлить : ");
        int b = in.nextInt();
        System.out.print("Результат: " + function(a,b));
    }
}