import java.util.ArrayList;
import java.util.HashMap;
public class Game {

    //Vad gör cardsingame? Tror den kan tas bort...
    private ArrayList<Card> cardsInGame;
    private Deck deck;
    private ArrayList<Player> playersInGame = new ArrayList<>();
    private Round activeRound;

    public Game(Deck deck){

        this.deck = deck;
        deck.GenerateCards();
        deck.shuffleDeck();
        
    }

    //Nu ger den bara de 5 "översta" varje gång, är helt OK enligt mig
    public void giveCard() {
        for (Player p : playersInGame){  
           for(int i = p.getHoldingCards().size(); i < 5; i++){
            if(this.deck.getCardDeck().size() > 0){
               Card c = this.deck.getCardDeck().get(0);
               p.addHoldingCards(c);
               this.deck.moveCardToDealt();
            }
            else{
                System.out.println("SLUT PÅ KORT");
            }
        }
        p.printHoldingCardsNameToString();
    }
}

    public void startNewRound(){
        Round r = new Round(this, playersInGame, playersInGame.get(0));
        this.activeRound = r;
    }

    public void placeCard(Player player, Card c){
        player.placeCard(this.activeRound, c);
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
