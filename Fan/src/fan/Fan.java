package fan;


public class Fan {
    
    boolean on;
    double circle;
    String color;
    private Hiz hiz;
   
   enum Hiz{
    LOW(1),
    MEDIUM(2),
    HIGH(3);
    
    private final int seviye;
    
    Hiz(int seviye){
    
        this.seviye=seviye;
    }
    
    }
   
 
   public Hiz gethiz(){
       return this.hiz;
               
   }
    public void sethiz(Hiz hiz){
        this.hiz=hiz;
   }
       public double getcircle(double circle){
       return this.circle=circle;
   }
    public void setcircle(double circle){
        this.circle=circle;
   }
           public boolean geton(boolean on){
       return this.on=on;
   }
    public void seton(boolean on){
        this.on=on;
   }
           public String getcolor(String color){
       return this.color=color;
   }
    public void setcolor(String color){
        this.color=color;
   }
    @Override
    public String toString(){
    if(this.on==true)
    {
       return "Fan hizi="+this.hiz+"/"+"Fan Rengi="+this.color+"/"+"Fan Yaricap="+this.circle;
    }
    else 
    {
           return "Fan Durumu="+this.on+"/"+"Fan Rengi="+this.color+"/"+"Fan Yaricap="+this.circle;

    }
      
    }
 
}
