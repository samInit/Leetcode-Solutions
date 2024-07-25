class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,  new int[nums.length],  0,  nums.length - 1);
        return nums;
    }
   public void sort(int[] arr, int[] temp, int low , int high){
        if(low < high){ 
        int mid = low + (high - low) / 2; 
        sort(arr, temp, low, mid);
        sort(arr, temp, mid+1, high);
        merge(arr, temp, low, mid, high);
    }
    }
    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high ; i++) {
           temp[i] = arr[i];
        }
        int i = low; 
        int j = mid + 1; 
        int k = low; 

        while(i <= mid && j <= high){
            if(temp[i] < temp[j]){
                arr[k] = temp[i];
                i++;
            }else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
}