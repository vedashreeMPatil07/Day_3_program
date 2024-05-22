import java.util.Scanner;


/* for 100units = units*2
for 100-150 = units *3
for 150-200 =units *4
for  201-250 =units *5
for 251-300=units *6
for 301-500=units *7
above 500 =units *8
*/ 
public class Billing {
    public static void main(String[] args) {
       
                int unitsConsumed = 500;
                double billAmount = 0;
        
                billAmount = unitsConsumed <= 100 ?
                        unitsConsumed * 2 :
                        unitsConsumed <= 150 ?
                     100 * 2 + (unitsConsumed - 100) * 3 :
                     unitsConsumed <= 200 ?
                    100 * 2 + 50 * 3 + (unitsConsumed - 150) * 4 :
                     unitsConsumed <= 250 ?
                     100 * 2 + 50 * 3 + 50 * 4 + (unitsConsumed - 200) * 5 :
                      unitsConsumed <= 300 ?
                    100 * 2 + 50 * 3 + 50 * 4 + 50 * 5 + (unitsConsumed - 250) * 6 :
                    unitsConsumed <= 500 ?
                       100 * 2 + 50 * 3 + 50 * 4 + 50 * 5 + 50 * 6 + (unitsConsumed - 300) * 7 :
                     100 * 2 + 50 * 3 + 50 * 4 + 50 * 5 + 50 * 6 + 200 * 7 + (unitsConsumed - 500) * 8;
        
                System.out.println("Electricity Bill: $" + billAmount);
            System.out.println("other approch ..............");
        //other approch 
   

 int units=500;
        double billAm = (units >= 0 && units <= 100) ? units * 2 :
                     (units >= 101 && units <= 150) ? (100 * 2) + ((units - 100) * 3) :
                     (units >= 151 && units <= 200) ? (100 * 2) + (50 * 3) + ((units - 150) * 4) :
                     (units >= 201 && units <= 250) ? (100 * 2) + (50 * 3) + (50*4) +((units - 200) * 5) :
                     (units >= 251 && units <= 300) ? (100 * 2) + (50 * 3) + (50*4) + (50*5) + ((units - 250) * 6) :
                     (units >= 301 && units <= 500) ? (100 * 2) + (50 * 3) + (50*4) + (50*5)+(50*6)+((units - 300) * 7) :
                     (units >= 501 ) ? (100 * 2) + (50 * 3) + (50*4) + (50*5)+(50*6)+(200*7)+((units - 500) * 8) : 0;
System.out.println(billAm);

    }
  }
