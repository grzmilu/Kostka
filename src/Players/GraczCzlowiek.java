package Players;

import java.util.*;
public class GraczCzlowiek extends Player {
     public GraczCzlowiek (){
       
   }
    public GraczCzlowiek (String name){
       super(name);
   }
    
    Scanner sc = new Scanner(System.in);
    @Override
    public int zgaduj(){       
     int strzal = sc.nextInt();
    System.out.println("Twoj strzal: "+strzal);
   return strzal;
   } 
}
