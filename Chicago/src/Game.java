import java.util.ArrayList;
import java.util.List;
public class Game {

    //Vad gör cardsingame? Tror den kan tas bort...
    private ArrayList<Card> cardsInGame;
    private Deck deck;
    private ArrayList<Player> playersInGame = new ArrayList<>();

    public Game(Deck deck){
        this.deck = deck;

        deck.GenerateCards();
        deck.shuffleDeck();

    }

    //Kan göra den här rekursiv om man skulle vilja. Tror jag. 
    public void giveCard(Player p) {
      
        for(int i = p.getHoldingCards().size(); i < 5; i++){
            Card c = this.deck.getCardDeck().get(0);
            p.addHoldingCards(c);
            this.getDeck().moveCardToDealt();
        }
        p.printHoldingCardsNameToString();
    }


    //Känns som att man kan slå ihop fillHand och giveAllPlayersFirstHand
    public void tossCard(Player p, Card c){
        System.out.println(p.getName() + " tossing " + c.getFullCard());
        p.getHoldingCards().remove(c);
        p.printHoldingCardsNameToString();
    }

    public ArrayList<Card> getCard(){
        return cardsInGame;
    }
    public Deck getDeck() {
        return deck;
    }
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    
    public ArrayList<Player> getPlayersInGame() {
        return playersInGame;
    }

    public void addPlayer(Player player) {
        this.playersInGame.add(player);
        System.out.println("Players added to game: " + player.getName());
    }

}
