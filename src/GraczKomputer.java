import java.util.*;
public class GraczKomputer extends Player {
    Random r = new Random();
    @Override
   public int zgaduj(){
   int strzal;
   strzal=r.nextInt(5)+1;   
    System.out.println("Strzal komputera: "+strzal);
   return strzal;
   } 
}
