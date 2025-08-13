import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    private Integer[] ranks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private ArrayList<Card> cardDeck = new ArrayList<>();
    private ArrayList<Card> dealtCards = new ArrayList<>();
    private ArrayList<Card> tossedCards = new ArrayList<>();

    public Deck(){
        
    }

    public void GenerateCards(){
         for(Integer rank : ranks){
            for (String suit : suits){
                this.cardDeck.add(new Card(rank, suit)); 
            }
        }

    }

    public void printDeck(){
        for(Card c : cardDeck){
            System.out.println(c.getFullCard());
        }
    }

    public void shuffleDeck(){
        System.out.println("Shuffling");
        Collections.shuffle(this.cardDeck);
        System.out.println("Shuffled cards");
    }
    
    //Supposed to move the dealt card from cardDeck to dealtCards
    public void moveCardToDealt() {
        dealtCards.add(this.cardDeck.get(0));
        this.cardDeck.remove(0);     
    }
    public void moveCardToTossed(Card c) {
        this.tossedCards.add(c);
        System.out.println("Tossed: " + c.getFullCard());
        this.dealtCards.remove(c);
        System.out.println("All tossed cards: " + tossedCards);     
    }

    public Integer[] getRanks() {
        return ranks;
    }

    public void setRanks(Integer[] ranks) {
        this.ranks = ranks;
    }

    public String[] getSuits() {
        return suits;
    }

    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }
}

