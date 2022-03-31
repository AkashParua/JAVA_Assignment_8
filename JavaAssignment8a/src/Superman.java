public class Superman extends Kryptonian implements Flyer{
    public void takeoff()
    {
          System.out.println("Jumping to fly");
    }
    public void land()
    {
           System.out.println("Thumping into the ground");
    }
    public void fly()
    {
        System.out.println("Zoom!");
    }
    public void leapBuilding()
    {
        System.out.println("Jumping from one building to another");
    }
    public void stopBullet()
    {
        System.out.println("Bullet Stopped");
    }
    @Override
    public void eat()
    {
        System.out.println("Eating like a gentleman");
    }
}
