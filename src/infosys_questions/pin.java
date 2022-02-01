package infosys_questions;

public class pin {
    static String pin(int pinArray[], int n){
        String s = "";

        for(int i=0; i< pinArray.length; i++){
            int num = pinArray[i];
            int sum =0;
           while(num > 0 || sum > 9){
               if(num == 0){
                   num = sum;
                   sum =0;
               }
               int rem = num % 10;
               sum += rem;
               num /= 10;
           }
           if(sum % 2 !=0){
               s += (char)('a'+(sum-1));
           }else{
               s += sum;
           }
        }
        return s;
    }
    public static void main(String[] args) {
       int arr[] = {14, 18, 6, 548, 46, 78};
        System.out.println(pin(arr, arr.length));
    }
}
