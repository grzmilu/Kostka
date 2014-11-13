import Players.GraczKomputer;
import Players.GraczCzlowiek;
import Players.Player;


public class kostka {

    
    public static void main(String[] args) {     
    
      Game game= new Game();
      Player player=new GraczKomputer("Komputer");
      
      game.addPlayer(player);
      game.addPlayer(new GraczCzlowiek("Adam"));
      game.addPlayer(new GraczCzlowiek("Marek"));
      game.addPlayer(new GraczCzlowiek("Adamds"));
      game.removePlayer("Marek");
      
      game.start(); 
      
   
      
     
      
 
}
}
