class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n=asteroids.length;
        long weight=mass;
        for(int i=0; i<n; i++){
            if(weight>=asteroids[i]){
                weight += asteroids[i];
            }else if(weight<asteroids[i]){
                return false;
            }
        }
        return true;
    }
}