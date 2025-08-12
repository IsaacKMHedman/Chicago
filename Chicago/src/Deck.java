import java.util.ArrayList;
import java.util.List;

public class Deck {
    private Game game;
    private Integer[] ranks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private List<Card> cards;

    public Deck(Game game){
        this.game = game;
    }

    public void GenerateCards(){
         for(Integer rank : ranks){
            for (String suit : suits){
                Card a = new Card(rank, suit);
                this.cards.add(a); 
            }
        }
        //Skriv ut genererade
        System.out.println("Skriver ut alla genererade kort för att kontrollera");
        for(Card c : cards) {
            System.out.println(c.getSuit()+ ", " + c.getRankName());
        }

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

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }    
}

