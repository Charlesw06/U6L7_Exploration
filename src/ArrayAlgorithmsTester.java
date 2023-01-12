import java.util.Arrays;

public class ArrayAlgorithmsTester
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.shiftNumRightModify(nums, 2);

        // original array IS modified; all elements shifted left 2
        System.out.println(Arrays.toString(nums));

        int[] sameNums = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.shiftNumRightModify(sameNums, 4);

        // original array IS modified; all elements shifted left 4
        System.out.println(Arrays.toString(sameNums));

        int[] moreNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.shiftNumRightModify(moreNums, 8);

        // original array IS modified; all elements shifted left 8
        System.out.println(Arrays.toString(moreNums));

        int[] moreNumsAgain = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.shiftNumRightModify(moreNumsAgain, 10);

        // original array IS modified; all elements shifted left 10
        System.out.println(Arrays.toString(moreNumsAgain));
    }
}
