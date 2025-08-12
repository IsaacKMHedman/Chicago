import java.util.ArrayList;

public class Player {
    
    private Game game;
    private String name;
    private ArrayList<Card> holdingCards;

    public Player(String name, Game game){
        this.name = name;
        this.game = game;
    }
}
