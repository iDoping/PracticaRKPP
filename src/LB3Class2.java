public class LB3Class2 {
    String name;
    String phoneNumber;
    int amountOfCar;
    int damages;

    LB3Class2() {
        name = "Имя";
        phoneNumber = "Телефонный номер";
        amountOfCar = 0;
        damages = 1;
    }

    LB3Class2(String n,String p) {
        name = n;
        phoneNumber = p;
        amountOfCar = 0;
        damages = 1;
    }

    LB3Class2(String n,String p, int a, int b) {
        name = n;
        phoneNumber = p;
        amountOfCar = a;
        damages = b;
    }

    void ScreenOut() {
        System.out.println("Название мастерской: " + name + "\n" + "Номер телефона: " + phoneNumber +"\n"+ "Вместимость: "+amountOfCar+ " машин ");
    }

    public double Profit(int price,double nds)
    {
        return this.amountOfCar * (price * nds) - this.damages;
    }

    public double Profit(int price)
    {
        return this.amountOfCar * (price * 13) - this.damages;
    }
}

    class Truck extends LB3Class2 {
        static int workPrice = 500;
        int pricePerHour;
        int workHours;
        int costs;

        int TotalValue() {
            return workPrice + (pricePerHour * workHours) - costs;
        }
    }

    class Motocikle extends Truck{
    int amountOfMoto;

    int TotalValueMoto()
    {
        return workPrice + (pricePerHour * workHours) * amountOfMoto - costs;
    }
    }
