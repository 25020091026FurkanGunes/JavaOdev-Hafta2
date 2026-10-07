package random;
import java.util.Random; 

public class Rastgele {

  
    public static void main(String[] args) {
        Random r1=new Random(); 
        for(int i=1;i<=50;i++){
        int sayi=r1.nextInt(100);
        System.out.println("Sayi"+i+"="+sayi);
        }
    }  
}