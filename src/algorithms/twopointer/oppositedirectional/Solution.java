package algorithms.twopointer.oppositedirectional;

class Solution {
    public static int maxDistance(int[] colors) {
        if(colors.length < 1){
            return -1;
        }

        int slow =0;
        int fast =colors.length-1;
        int maxDistanceBack = 0;

        for(int i=0; i<colors.length; i++){
            if(colors[slow] != colors[fast]){
                maxDistanceBack = Math.max(Math.abs(fast - slow), maxDistanceBack);
                break;
            }else{
                fast--;
            }
        }

        slow =0;
        fast =colors.length-1;
        int maxDistanceFront = 0;

        for(int i=0; i<colors.length; i++){
            if(colors[slow] != colors[fast]){
                maxDistanceFront = Math.max(Math.abs(fast - slow), maxDistanceFront);
                break;
            }else{
                slow++;
            }
        }

        return Math.max(maxDistanceFront,  maxDistanceBack);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,6,1,1,1};
        System.out.println(maxDistance(arr));
    }
}
