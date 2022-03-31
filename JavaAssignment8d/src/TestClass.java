import java.util.Scanner;
public class TestClass {
    public interface TestInterface {        //interface with abstract method in it
        public abstract void name_the_card();
    }
    enum Cards implements TestInterface{       //enum that implements the Interface
        SPADES,
        CLUBS,
        DIAMONDS,
        HEARTS;
        public void name_the_card()         //the method in interface is defined
        {
            System.out.println("The type of card you chose :"+this);
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Choose 1)SPADES 2)CLUBS 3)DIAMONDS 4)HEARTS:");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Cards card = Cards.SPADES;
        switch (c){
            case 1:
                break;
            case 2:
                card = Cards.CLUBS;
                break;
            case 3:
                card = Cards.DIAMONDS;
                break;
            case 4:
                card = Cards.HEARTS;
                break;
        }
        card.name_the_card();   //the method is class from the instance of eum

    }

}
