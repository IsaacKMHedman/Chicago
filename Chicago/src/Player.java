import java.util.ArrayList;

public final class Player {
    
    private Card activePlacedCard;
   
    private String name;
    private ArrayList<Card> holdingCards = new ArrayList<>();

    public Player(String name){
        this.name = name;
    }

    public void placeCard(Game game, int i){
        placeCard(game, this.getHoldingCards().get(i));
    }

    public void placeCard(Game game, Card c){
        this.activePlacedCard = c;
        this.holdingCards.remove(c);
        game.placeCard(this, c);
    }

    public void placeCard(Round r, Card c){
        r.placeCard(this, c);
    }

    public void placeCard(Round r){    
        for(Card c : holdingCards){
            placeCard(r, c);
        }
    }
    
    public void tossCard(Game game, int i){
        tossCard(game, this.holdingCards.get(i));
    }

    public void tossCard(Game game, Card c){
        game.getDeck().moveCardToTossed(c);
        holdingCards.remove(c);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Card getActivePlacedCard() {
        return activePlacedCard;
    }

    public void setActivePlacedCard(Card activePlacedCard) {
        this.activePlacedCard = activePlacedCard;
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
