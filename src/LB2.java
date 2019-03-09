import java.util.Scanner;

public class LB2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите метод");
        int k = in.nextInt();
        switch (k)
        {
            case 1:
                Autorepearing temp = new Autorepearing();
                temp.ScreenOut();
                break;
            case 2:
                Autorepearing temp1 = new Autorepearing("Имя","Номер телефона");
                System.out.println("Введите название автомастерской");
                temp1.name = in.next();
                System.out.println("Введите телефонный номер автомастерской");
                temp1.phoneNumber = in.next();
                temp1.ScreenOut();
                break;
            case 3:
                Autorepearing temp2 = new Autorepearing("Имя","Номер телефона",0,1);
                System.out.println("Введите название автомастерской");
                temp2.name = in.next();
                System.out.println("Введите телефонный номер автомастерской");
                temp2.phoneNumber = in.next();
                System.out.println("Введите размер убытков");
                temp2.ybitki = in.nextInt();
                System.out.println("Введите вместичмость автомастерской");
                temp2.amountOfCar = in.nextInt();
                if (temp2.amountOfCar < 0)
                {
                    System.out.println("Отрицательное значение недопустимо");
                }
                else
                {
                    temp2.ScreenOut();

                    System.out.println("Прибыль = " + temp2.Pribil(100,2.5));
                }
                break;
        }
    }

    static class Autorepearing
    {
        String name;
        String phoneNumber;
        int amountOfCar;
        int ybitki;


        Autorepearing()
        {
           name = "Имя";
           phoneNumber = "Телефонный номер";
           amountOfCar = 0;
           ybitki = 1;
        }

        Autorepearing(String n,String p)
        {
          name = n;
          phoneNumber = p;
          amountOfCar = 0;
          ybitki = 1;
        }

        Autorepearing(String n,String p, int a, int b)
        {
            name = n;
            phoneNumber = p;
            amountOfCar = a;
            ybitki = b;
        }

        void ScreenOut()
        {
            System.out.println("Название мастерской: " + name + "\n" + "Номер телефона: " + phoneNumber +"\n"+ "Вместимость: "+amountOfCar+ " машин ");
        }

        public double Pribil(int price,double nds)
        {
            return this.amountOfCar * (price * nds) - this.ybitki;
        }
    }
}