import java.util.ArrayList;
import java.util.HashSet;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int len = arr1.length + arr2.length;
        int [] arr3 = new int[len];
        for(int i=0; i <arr1.length;i++){
            arr3[i]=arr1[i];
            for(int j=(arr2.length+1);j<len;j++){
                int count = 0;
                arr3[-len]=arr2[count];
            }
        }
        return arr3;
    }
}
