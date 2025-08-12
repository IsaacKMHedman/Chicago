import java.util.ArrayList;
import java.util.List;

public class Deck {

    private Game game;
    private Integer[] ranks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private ArrayList<Card> cards;

    public Deck(){
        
    }

    public void GenerateCards(){
         for(Integer rank : ranks){
            for (String suit : suits){
                Card a = new Card(rank, suit);
                this.addCards(a); 
            }
        }
        //Skriv ut genererade
        System.out.println("Skriver ut alla genererade kort för att kontrollera");
        for(Card c : cards) {
            System.out.println(c.getSuit()+ ", " + c.getRankName());
        }
    }
    
    public void ShuffleDeck(){
        System.out.println("Shuffling");
        game.getCard().removeAll(cards);
        System.out.println("Shuffled");
        this.GenerateCards();
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

    public void setSuits(String[] suits) {
        this.suits = suits;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCards(Card card) {
        this.cards.add(card);
    }    
}

