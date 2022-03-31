public class Main {
    public static void main(String[] args)
    {
        System.out.println("Instantiating Airplane");
        Airplane obj1 = new Airplane();
        obj1.takeoff();
        obj1.fly();
        obj1.land();
        System.out.println("___________________________________");
        System.out.println("Instantiating bird");
        Bird obj2 = new Bird();
        obj2.takeoff();
        obj2.fly();
        obj2.land();
        obj2.eat();
        System.out.println("_____________________________________");
        System.out.println("Instantiating Superman");
        Superman obj3 = new Superman();
        obj3.eat();
        obj3.takeoff();
        obj3.fly();
        obj3.land();
        obj3.leapBuilding();
        obj3.stopBullet();
    }
}