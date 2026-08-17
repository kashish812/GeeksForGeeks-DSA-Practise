class Solution {
    ArrayList<Integer> find(int arr[], int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = arr.length-1;
        int index1= -1;
         while(left<=right){
             int mid = left+(right-left)/2;
             if(arr[mid]== target){
                 index1 = mid;
                 right = mid-1;
                 
             }
             else if (arr[mid]<target){
                 left = mid+1;
             }
             else{
                 right = mid-1;
             }
         }
         left = 0;
         right = arr.length-1;
         int index2 = -1;
         while(left<=right){
             int mid = left+(right-left)/2;
             if(arr[mid]==target){
                 index2 = mid;
                 left = mid+1;
             }
             else if(arr[mid]<target){
                 left = mid+1;
             }
             else{
                 right = mid-1;
             }
         }
         ans.add(index1);
         ans.add(index2);

       return ans;
    }
    
}
