import java.util.Scanner;
public class TestClass {
    enum Cards{         //defining the enum
        Hearts,
        Spades,
        Diamonds,
        Clubs;
        Cards(){              //constructor for each enum that will be called for each enum values
            System.out.println("Constructor Called for card type =>"+ this);
        }
        public void show()           //a method of enum
        {
            System.out.println("The Card Type you chose is :"+ this);
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Choose a card  1)Hearts 2)Spades 3)Diamonds 4)Clubs-->");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Cards cards = Cards.Clubs;
        switch (choice)
        {
            case 1:
                cards = Cards.Hearts;
                break;
            case 2:
                cards = Cards.Spades;
                break;
            case 3:
                cards = Cards.Diamonds;
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Option");
        }
        cards.show();     //calling the enum method
        System.out.println("The Ordinal of the Card type is :"+ cards.ordinal());  //showing the ordinal of the value chosen
    }
}
