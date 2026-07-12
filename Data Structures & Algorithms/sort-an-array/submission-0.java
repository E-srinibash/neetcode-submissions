class Solution {
    public static void merge(int[] arr,int start,int mid,int end){
        int m = mid-start+1;
        int n = end-mid;

        int L[] = new int[m];
        int R[] = new int[n];

        for(int i =0;i<m;i++){
            L[i] = arr[start+i];
        }
        for(int j=0;j<n;j++){
            R[j] = arr[mid+1+j];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while(i<m && j<n){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<m){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    public static int[] mergeSort(int[] arr,int start,int end){
        if(start<end){
        int mid = start + (end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
        }
        return arr;
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
      return mergeSort(nums,0,n-1);
    }
}