import java.util.Arrays;

public class ArrayAlgorithmsTester
{
    public static void main(String[] args)
    {
        int[] even = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.reverseModify(even);

        // original array IS modified
        System.out.println(Arrays.toString(even));

        int[] odd = {1, 2, 3, 4, 5};
        ArrayAlgorithms.reverseModify(odd);

        // original array IS modified
        System.out.println(Arrays.toString(odd));

        int[] even2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.reverseModify(even2);

        // original array IS modified
        System.out.println(Arrays.toString(even2));

        int[] odd2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArrayAlgorithms.reverseModify(odd2);

        // original array IS modified
        System.out.println(Arrays.toString(odd2));
    }
}
