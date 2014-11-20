
import Players.GraczKomputer;
import Players.Player;
import java.util.*;

public class Game {

    private Player player;
    private List<Player> players = new ArrayList<>();
    private Map<String, Integer> stats = new HashMap<>();

    void start() {
        Random r = new Random();
        boolean czy = true;
        int wylosowane;
        int strzal;
        int ilosc = 1;
        int tmp = 0;
        do {
            ilosc++;
            do {
                wylosowane = r.nextInt(7) + 1;
                System.out.println("Wylosowane: " + wylosowane);
                for (Player player : players) {


                    strzal = player.zgaduj();


                    if (strzal == wylosowane) {
                        System.out.println(player.getName() + " trafił");
                        System.out.println();
                        czy = false;
                        stats.put(player.getName(), stats.get(player.getName()) + 1);
                    } else {
                        System.out.println(player.getName() + " nie trafił");
                        System.out.println();
                    }
                }
            } while (czy);
        } while (ilosc <= 3);
        displayScores();
    }

    void addPlayer(Player player) {
        int i = 1;
        stats.put(player.getName(), 0);
        if (player != null) {
            for (Player playerr : players) {
                String name = player.getName();
                if (name.equals(playerr.getName())) {
                    player.setName(name + i);
                    i++;
                }

            }

            players.add(player);



        } else {
            throw new IllegalArgumentException("Nie mozesz przekazać nulla");
        }

    }

    void removePlayer(String name) {
        for (Player playerr : players) {
            if (playerr.getName().equals(name)) {
                players.remove(playerr);
                //ITERATOR
            }
        }



    }

    //void displayScores() {
     //   for (Player playerr : players) {
      //      System.out.println(playerr.getName() + " trafil: " + stats.get(playerr.getName()));
       // }
  //  }
    void displayScores() {
        for(Map.Entry<String,Integer> stat:stats.entrySet()){
        System.out.println(); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }
        
    }    
}