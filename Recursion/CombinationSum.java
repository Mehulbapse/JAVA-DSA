package Recursion;


import java.util.*;

public class CombinationSum {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        getTargetCombination(candidates,target,0,new ArrayList<Integer>());
        return res;


    }

    public void getTargetCombination(int[] candidates,int currentTarget,int index,List<Integer> result){
        /**
         * Base case
         * 1. If currentTarget is reaching to Zero
         * 2. Current Position is equal to the length of the Array
         */
        if (currentTarget == 0) {
            res.add(new ArrayList<>(result));
            return;
        }
        if (index == candidates.length) {
            return;
        }

        if(candidates[index] <= currentTarget){
            result.add(candidates[index]);
            getTargetCombination(candidates,currentTarget-candidates[index],index,result);
            result.remove(result.size() - 1);
        }
        getTargetCombination(candidates,currentTarget,index+1,result);
    }

    public static void main(String[] args) {
        CombinationSum result = new CombinationSum();
        int[] array = {2,3,6,7};

        System.out.println( result.combinationSum(array,7));
    }
}