import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        for(int i = 0; i <list.size(); i++)
        {
            int a = list.get(i);
            int k = i - 1;
            while(k > -1 && list.get(a) > k)
            {
                list.set(k+1, list.get(k));
                k--;
            }
            list.set(k+1, a);
        }
        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int [] rah = new int[arr1.length + arr2.length];
        int i = 0;
        int k = 0;
        int j = 0;
        while(i < arr1.length && k < arr2.length)
        {
            if(arr1[i] < arr2[k])
            {
                rah[j] = arr1[i];
                i++;
            }
            else
            {
                rah[j] = arr2[k];
                k++;
            }
            j++;
        }
        while(i < arr1.length)
        {
            rah[j] = arr1[i];
            i++;
            j++;
        }
        while(k < arr2.length)
        {
            rah[j] = arr2[k];
            i++;
            k++;
        }
        return rah;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
