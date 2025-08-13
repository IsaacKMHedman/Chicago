import java.util.ArrayList;

public class Player {
    
    private String name;
    private ArrayList<Card> holdingCards = new ArrayList<>();

    public Player(String name){
        this.name = name;
    }

    public void tossCard(Card c){
        holdingCards.remove(c);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHoldingCards() {
        return holdingCards;
    }
    public void printHoldingCardsNameToString(){

        System.out.println(this.name + " holding:");
        for(Card c : holdingCards){
            System.out.println(" " + c.getFullCard());
        }
    }

    public void addHoldingCards(Card c){
        this.holdingCards.add(c);
    }


}
