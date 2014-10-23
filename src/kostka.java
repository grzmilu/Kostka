
import Players.GraczCzlowiek;
import Players.GraczKomputer;
import Players.Player;
import java.util.*;
public class kostka {

    
    public static void main(String[] args) {
      Random r = new Random();
      
      Player obiekt=new GraczKomputer("Komp");      
      try{
      obiekt.setName(null);
      System.out.println("Imie zmienione na "+obiekt.getName());
      }catch(Exception e){System.out.println(e.getMessage());}
     
      int wylosowane;
      int strzal;
        do{
        wylosowane=r.nextInt(7)+1;
        System.out.println("Wylosowane: "+wylosowane+obiekt.getName());
        strzal=obiekt.zgaduj();
       
        if(strzal==wylosowane){
        System.out.println("Trafione!");
        }
        else{
         System.out.println("Pudło!");}
        }      
        while(strzal!=wylosowane);
        
    
 
}
}
