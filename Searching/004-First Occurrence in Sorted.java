class Solution {
    public int firstSearch(int[] arr, int target) {

        int n = arr.length;
        int left = 0;
        int right = n-1;
        int index = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                index = mid;
                right = mid-1;
            }
            else if(arr[mid]<target){
                left = mid+1;
                
            }
            else{
                right = mid-1;
            }
        }
            return index;
        }
    
}
