package Players;

import java.util.*;
public class GraczKomputer extends Player {
    
    public GraczKomputer (){
       
    }
    public GraczKomputer (String name){
        super(name);
    }
    
    Random r = new Random();
    @Override
   public int zgaduj(){
   int strzal;
   strzal=r.nextInt(6)+1;   
    System.out.println("Strzal komputera: "+strzal);
   return strzal;
   } 
}
