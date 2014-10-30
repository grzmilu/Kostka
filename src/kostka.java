
import Players.GraczKomputer;
import Players.GraczCzlowiek;
import Players.Player;


public class kostka {

    
    public static void main(String[] args) {     
    
      Game game= new Game();
      Player player=new GraczKomputer("Komputer");
      
      game.addPlayer(player);
      game.addPlayer(new GraczCzlowiek("Ty"));
      game.start(); 
   
      
     
      
 
}
}
