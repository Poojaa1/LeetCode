class Solution {
    public boolean checkIfExist(int[] arr) {
        
     //2 3 6 10
       
        for(int i=0;i<arr.length;i++){
            int right=arr.length-1;
            while(i<right){
                if(arr[i]*2==arr[right])return true;
          else if(arr[i]==2*arr[right])return true;
              else right--;  

            }
        }return false;
    }
}