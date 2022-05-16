package questions.arrays;

public class CawStudio {
    static long volume(int M, int N, String[] Grid){
        long res =0;

        for(int i=0; i<M; i++){
            String temp = Grid[i];
            for(int j =1; j<N-1; j++){
                if(temp.charAt(j) == '.'){
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] str = {".**.", "*.*.", "*..*", "****"};
        System.out.println(volume(4, 4, str));
    }
}
