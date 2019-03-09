import java.util.Scanner;
public class Practica1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        double x = in.nextDouble();
        System.out.print("Введите Y: ");
        double y = in.nextDouble();
        System.out.print("Выберите операцию: +,-,*,/: ");
        String a = in.next();
        System.out.print("Результат: ");
        switch (a)
        {
            case "+" : System.out.println(x + y);
            break;
            case "-" : System.out.println(x - y);
            break;
            case "*" : System.out.println(x * y);
            break;
            case "/" :
                if (y == 0)
                {
                   System.out.println("Ошибка деления на 0");
                }
                else
                System.out.print(x / y);
            break;
            default: System.out.println("Ошибка: Неизвестный символ");
        }
    }
}