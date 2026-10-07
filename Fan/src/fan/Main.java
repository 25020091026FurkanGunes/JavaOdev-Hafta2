
package fan;


public class Main {
       public static void main(String[] args) {
        Fan f1=new Fan();
        Fan f2=new Fan();
        
        f1.on=true;
        f1.sethiz(Fan.Hiz.HIGH);
        f1.color="Sari";
        f1.circle=10.0;
        
        f2.on=false;
        f2.sethiz(Fan.Hiz.MEDIUM);
        f2.color="Mavi";
        f2.circle=5.0;
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());

    
    }
    
    
}
