import java.util.HashMap;

public final class Card {
    
    private int rank;
    private String suit;
    private HashMap<String, Integer> suitTranslation = new HashMap<>();

    public Card(int rank, String suit){
        this.rank = rank;
        this.suit = suit;
        this.suitTranslation.put("Hearts",1);
        this.suitTranslation.put("Diamonds",2);
        this.suitTranslation.put("Clubs",3);
        this.suitTranslation.put("Spades",4);
    }


   public int getRank() {
        return rank;
    }
    public String getSuit() {
        return suit;
    }

    public String getRankName(){
        if(this.rank < 11){
            return String.valueOf(rank);
        }
        switch (rank) {
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            case 14: return "A";
            default: return "?";
        }
    }
    public String getFullCard(){
        return this.getSuit() + " " + this.getRankName();
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
  
}