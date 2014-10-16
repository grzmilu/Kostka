
import java.util.*;
public class kostka {

    
    public static void main(String[] args) {
      Random r = new Random();
      
      Player obiekt=new GraczCzlowiek();
      int wylosowane;
      int strzal;
        do{
        wylosowane=r.nextInt(6)+1;
        System.out.println("Wylosowane: "+wylosowane);
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
