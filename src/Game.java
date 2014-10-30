
import Players.GraczKomputer;
import Players.Player;
import java.util.*;


public class Game {
    
    private Player player;
    private List<Player> players = new ArrayList<>();
    
    
    void start(){
    Random r = new Random();
 boolean czy=true;
    int wylosowane;
      int strzal;

        do{
            wylosowane=r.nextInt(7)+1;
             System.out.println("Wylosowane: "+wylosowane);
            for (Player player: players){ 
        
       
        strzal=player.zgaduj();     
        
        
        if(strzal==wylosowane){
        System.out.println(player.getName()+" trafił");
        System.out.println();
        czy=false;
        }
        else{
         System.out.println(player.getName()+" nie trafił");
        System.out.println();}
        }
        }
        while(czy);
        
    }
    void addPlayer(Player player){
       if(player!=null) {
    this.player=player;
    players.add(player);
    
        
     
       }
       else{throw new IllegalArgumentException("Nie mozesz przekazać nulla");}
    }   
}
