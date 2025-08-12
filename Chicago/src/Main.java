public class Main {
    
    public static void main(String[] args) throws Exception {
        //För att kunna ha flera spel igång med olika kortlekar
        Deck deck = new Deck();
        Game game = new Game(deck);
        
        deck.GenerateCards();
        Player player1 = new Player("Isaac", game);
        deck.ShuffleDeck();
    }
}
