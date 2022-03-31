public class Airplane extends Vehicle implements Flyer{
         public void takeoff()
         {
             System.out.println("Takeoff");
         }
         public void land()
         {
             System.out.println("Landing Initiated");
         }
         public void fly()
         {
             System.out.println("In the air");
         }
}
