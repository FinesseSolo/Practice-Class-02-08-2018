import java.util.Scanner ;
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card cardType1 = new Card(7, "Hearts");
		Card card2Type1 = new Card(8, "Clubs");
		Card card3Type1 = new Card(6, "Clover");
		Card cardType2 = new Card(4, "Diamonds");
		Card Lucky = new Card(1, "Spades");
		Card card2Type2 = new Card(3, "Clubs");
		Card cardType3 = new Card(5, "Clubs");
		Card card2Type3 = new Card(5, "Hearts");
		Card card3Type3 = new Card(2, "Clover");
		System.out.println(card2Type1.Number + card2Type1.Suit);
		System.out.println(Lucky.Number + Lucky.Suit);
		System.out.println(card2Type3.Number + card2Type3.Suit);
		System.out.println(cardType1.Number + cardType1.Suit);
		System.out.println(card3Type1.Number + card3Type1.Suit);
		System.out.println(cardType2.Number + cardType2.Suit);
		System.out.println(card2Type2.Number + card2Type2.Suit);
		System.out.println(card2Type3.Number + card2Type3.Suit);
		System.out.println(card3Type3.Number + card3Type3.Suit );
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("What suit do you want");
		String Card2 = scanner.nextLine();
		
		System.out.println("Which number?");
		int Card =scanner.nextInt();
		
		if (Card == Lucky.Number && Card2.equals(Lucky.Suit)){
			System.out.println ("You win");
		}
		else {
			System.out.println("You Lose");
		}
		
		
	}
	

}
