import java.util.*;

class FindClosestElements {

    FindClosestElements() {}

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - k;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(x - arr[mid] > arr[mid + k] - x) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = start; i< start + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }


    public static void main(String[] args) {

    }


}
