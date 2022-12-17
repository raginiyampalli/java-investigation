package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Merge two sorted lists.
 * List a = {1,4,5};
 * List b = {2,3,4,10};
 * Result should be {1,2,3,4,4,5,10}
 */
public class MergeTwoSortedLists {

    public static List<Integer> merge(List<Integer> one, List<Integer> two){
        List<Integer> result = new ArrayList<>();
        int indexOfOne = 0;
        int indexOfTwo = 0;

        while(indexOfOne<one.size() && indexOfTwo<two.size()){
            if(one.get(indexOfOne) < two.get(indexOfTwo)){
                result.add(one.get(indexOfOne));
                indexOfOne++;
            } else {
                result.add(two.get(indexOfTwo));
                indexOfTwo++;
            }
        }

        while(indexOfOne<one.size()){
            result.add(one.get(indexOfOne));
            indexOfOne++;
        }

        while(indexOfTwo<two.size()){
            result.add(two.get(indexOfTwo));
            indexOfTwo++;
        }

        return result;
    }

    public static void main(String args[]){
        List<Integer> a= new ArrayList<>();
        a.add(4);a.add(6);a.add(10);

        List<Integer> b = new ArrayList<>();
        b.add(1);b.add(4);b.add(11);

        List<Integer> result = merge(a,b);

        for(int i: result){
            System.out.print(i + ",");
        }

    }
}
