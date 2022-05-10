package questions.arrays;

public class Test {
    static int solution(int n){
        for(int i=0; i<=13; i++){
            if(sum(i) == n){
                return i;
            }
        }
        return -1;
    }
    static int sum(int n){
        int t =n;
        int ans =0;
        while(t!=0){
            int r = t%10;
            ans +=r;
            t /=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(16));
    }
}
