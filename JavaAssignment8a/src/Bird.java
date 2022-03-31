public class Bird extends Animal implements Flyer{
    public void takeoff(){
        System.out.println("Wings Extended");
    }
    public void land()
    {
        System.out.println("Gliding and landing on feet");
    }
    public void fly()
    {
        System.out.println("Flapping Wings");
    }
}
