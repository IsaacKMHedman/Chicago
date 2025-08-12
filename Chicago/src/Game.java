import java.util.ArrayList;
import java.util.List;
public class Game {

    private ArrayList<Card> cardsInGame;
    private Deck deck;
    public Game(Deck deck){
        this.deck = deck;
    }
    public ArrayList<Card> getCard(){
        return cardsInGame;
    }
}
