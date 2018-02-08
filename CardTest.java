
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
	}

}
