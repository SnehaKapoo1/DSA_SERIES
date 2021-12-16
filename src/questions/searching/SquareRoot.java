package questions.searching;

public class SquareRoot {

	public static void main(String[] args) {
		int x =9;
		int low =1, high = x, answer = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mid <= x/mid){
                low = mid +1;
                answer = mid;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(answer);

	}

}
