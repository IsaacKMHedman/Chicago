import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Round {

    private HashMap<Player, Card> playedCards = new HashMap<>();
    private ArrayList<Stick> sticks = new ArrayList<>();
    private ArrayList<Player> roundPlayers = new ArrayList<>();
    private Player startPlayer;
    private Card startCard = playedCards.get(startPlayer);
    private Game game;

    public Round(Game game, ArrayList<Player> roundPlayers, Player startPlayer){
        this.game = game;
        this.startPlayer = startPlayer;
        this.roundPlayers.addAll(roundPlayers);
    }
    
    public void placeCard(Player p, Card c){
        playedCards.put(p, c);
        playedCardsToString();
    }
    
    public void allPlayersPlaceCard(){
        for(Player p : roundPlayers){
            p.placeCard(this);
        }
    }

    public void playedCardsToString(){
        for(Map.Entry<Player, Card> i : playedCards.entrySet()){
            System.out.println(i.getKey().getName() + " played " + i.getValue().getFullCard());
        }
    }

    public void checkWinningCard(HashMap<Player, Card> playedCards){
        for(Map.Entry<Player, Card> i : playedCards.entrySet()){
            System.out.println("Cards in game: " + i.getValue().getFullCard());
            if(i.getValue().getSuit() == startCard.getSuit()){
                System.out.println(i.getValue().getFullCard() + " not the correct suit ");
            }
        }
    }

}
