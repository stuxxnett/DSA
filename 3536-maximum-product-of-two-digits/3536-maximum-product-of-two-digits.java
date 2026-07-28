class Solution {
    public int maxProduct(int n) {
        int largest = -1;
        int sLargest = -1;
        while(n > 0 ){
            int rem = n%10;
            if(rem > largest){
                sLargest = largest;
                largest = rem;

            }
            else if(rem > sLargest){
                sLargest = rem;
            }
            n=n/10;
        }
        
        return largest * sLargest;

    }
}