/*///////////////////////////////////////// 
/
/yo dan can you see this ???
/Group: Kevin Barnum & Daniel Mallory
/
/Date: 19/1/2017
/ 
/Lab: 1 (Ch. 6 Arrays Review)
/
/Input: None?
/
/Output: Words
/
/
*/////////////////////////////////////////
import java.text.DecimalFormat;
public class LabOne{
   public static void main(String[] args){
   
      DecimalFormat cent = new DecimalFormat ("#.00");
      
      final int DAYS_IN_WEEK = 7;
      
      int temp;
      
      int dayOfWeek; 
           
      int[] employeeNumbers = {0,1,2,3,4,5,6,7};
      
      
      
      int[] totalHours = new int[8];
      double [] totalPay = new double [8];
      double[] payRates = {10.10,8.25,19.00,10.75,9.75,8.85,8.60,10.65};
      
      double[][] hoursWorked = {{2,4,3,4,5,8,8},
                                {7,3,4,3,3,4,4},
                                {3,3,4,3,3,2,2},
                                {9,3,4,7,3,4,1},
                                {3,5,4,3,6,3,8},
                                {3,4,4,6,3,4,4},
                                {3,7,4,8,3,8,4},
                                {6,3,5,9,2,7,9}};
            
      temp = 0;
               
      for(int i = 0; i < 8; i++){
         for(dayOfWeek = 0; dayOfWeek < 7; dayOfWeek++){
            temp+=hoursWorked[i][dayOfWeek];
         }
         totalHours[i] = temp;
         
         totalPay[i] = (double) temp * payRates[i];
         temp = 0;
      }
      selectionSort(totalHours,employeeNumbers,totalPay);
      
      for(int x = 7; x >= 0; x--){
         System.out.println("Employee number " + employeeNumbers[x] + " worked " + totalHours[x] + " hours."+" They made $"+ cent.format(totalPay[x])+" .");
      }
   }// end main
   public static void selectionSort(int[] list, int[] secondList, double [] thirdList){
      for(int i = list.length -1; i >= 1; i--){
         int currentMax = list[0];
         int currentMaxIndex = 0;
         
         for (int j=1; j <= i; j++) {
            if(currentMax < list[j]){
               currentMax = list[j];
               currentMaxIndex = j;
            }
         }
         
         if(currentMaxIndex != i){
            list[currentMaxIndex] = list[i];
            secondList[currentMaxIndex] = secondList[i];
            thirdList[currentMaxIndex] = thirdList[i];
            list[i] = currentMax;
            secondList[i] = currentMax;
            //thirdList[i] = currentMax;
         }
         
      }
   }
}// end class