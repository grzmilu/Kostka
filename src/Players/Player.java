package Players;


public abstract class Player {
    
   private String name;
   public Player (){
       this.name="anonim"; 
   }
   public Player (String name){
        if(name != null&&!name.isEmpty()){
            this.name=name;
        }
        else{
            this.name="anonim"; 
        }
   }     
   
   
   public void setName(String name){
       if(name != null&&!name.isEmpty()){
       this.name=name;
       }
       else{
           throw new IllegalArgumentException("Imie nie moze byc puste");
       }
   }
   public String getName(){
   
       return name;
   }
   public abstract int zgaduj(); 
}
