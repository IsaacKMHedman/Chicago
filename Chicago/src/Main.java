public class Main {
    
    public static void main(String[] args) throws Exception {
        //För att kunna ha flera spel igång med olika kortlekar
        Deck deck = new Deck();
        Game game = new Game(deck);
        Player player1 = new Player("Isaac");
        Player player2 = new Player("Isaac2");
        
        game.addPlayer(player1);
        game.addPlayer(player2);

        game.giveCard(player2);
        game.giveCard(player1);

        game.tossCard(player2, player2.getHoldingCards().get(0));
        
    }
}
