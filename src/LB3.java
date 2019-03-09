import java.util.Scanner;

public class LB3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите метод");
        int k = in.nextInt();
        switch (k)
        {
            case 1:
                LB3Class2 temp = new LB3Class2();
                temp.ScreenOut();
                break;
            case 2:
                LB3Class2 temp1 = new LB3Class2("Имя","Номер телефона");
                System.out.println("Введите название автомастерской");
                temp1.name = in.next();
                System.out.println("Введите телефонный номер автомастерской");
                temp1.phoneNumber = in.next();
                temp1.ScreenOut();
                break;
            case 3:
                LB3Class2 temp2 = new LB3Class2("Имя","Номер телефона",0,1);
                System.out.println("Введите название автомастерской");
                temp2.name = in.next();
                System.out.println("Введите телефонный номер автомастерской");
                temp2.phoneNumber = in.next();
                System.out.println("Введите размер убытков");
                temp2.damages = in.nextInt();
                System.out.println("Введите вместичмость автомастерской");
                temp2.amountOfCar = in.nextInt();
                if (temp2.amountOfCar < 0) {
                    System.out.println("Отрицательное значение недопустимо");
                }
                else {
                    temp2.ScreenOut();

                    System.out.println("Прибыль = " + temp2.Profit(100));
                }
                break;
            case 4:
                Truck truck1 = new Truck();
                System.out.println("РЕМОНТ ГРУЗОВИКА");
                System.out.println("Введите стоимость одного часа работы");
                truck1.pricePerHour = in.nextInt();
                System.out.println("Введите количество часов");
                truck1.workHours = in.nextInt();
                System.out.println("Введите стоимость расходов");
                truck1.costs = in.nextInt();
                System.out.print("Плата за ремонт: " + truck1.TotalValue());
                break;
            case 5:
                Motocikle moto1 = new Motocikle();
                System.out.println("РЕМОНТ МОТОЦИКЛОВ");
                System.out.println("Введите стоимость одного часа работы");
                moto1.pricePerHour = in.nextInt();
                System.out.println("Введите количество часов");
                moto1.workHours = in.nextInt();
                System.out.println("Введите количество мотоциклов");
                moto1.amountOfMoto = in.nextInt();
                System.out.println("Введите стоимость расходов");
                moto1.costs = in.nextInt();
                System.out.print("Плата за ремонт: " + moto1.TotalValueMoto());
                break;

        }
    }
}