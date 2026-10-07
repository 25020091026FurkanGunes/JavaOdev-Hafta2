package gregoriancalendar;
import java.util.GregorianCalendar;

public class Gregorian {
  

    public static void main(String[] args) {

        GregorianCalendar bugun =new GregorianCalendar();
        GregorianCalendar yenigun =new GregorianCalendar();

        System.out.print("Bugun= "+bugun.get(GregorianCalendar.DAY_OF_MONTH)+"/");
        System.out.print(bugun.get(GregorianCalendar.MONTH)+1);
        System.out.println("/"+bugun.get(GregorianCalendar.YEAR));
        
        long milisaniye=1234567898765L;
        
        yenigun.setTimeInMillis(milisaniye);
        
         System.out.print("Yeni Gun= "+yenigun.get(GregorianCalendar.DAY_OF_MONTH)+"/");
        System.out.print(yenigun.get(GregorianCalendar.MONTH)+1);
        System.out.println("/"+yenigun.get(GregorianCalendar.YEAR));

         

        
    }
    
}
