package datetime;
import java.util.Date;


public class DateTime {

    public static void main(String[] args) {


        long[] gecensure={ 10000L,100000L,1000000L,10000000L,100000000L,1000000000L,10000000000L,100000000000L};
        Date d1 = new Date();
        for(int i=0;i<gecensure.length;i++){
                    d1.setTime(gecensure[i]);
                    System.out.println(gecensure[i]+" Milisaniye Sonra="+d1);

        
        }
    
         
    
    }

    }
    

