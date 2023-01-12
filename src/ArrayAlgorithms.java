import java.util.Arrays;

public class ArrayAlgorithms {
    public static void printExclamation(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++) {
            System.out.println(wordList[i] + "!");
        }
    }

    public static void addExclamation(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] += "!";
        }
    }

    public static int sum(int[] numList)
    {
        int sum = 0;
        for (int i = 0; i < numList.length; i++) {
            sum += numList[i];
        }
        return sum;
    }

    public static double average(int[] numList)
    {
        return sum(numList) / (double) numList.length;
    }

    public static int minimum(int[] numList)
    {
        int min = numList[0];
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] < min) {
                min = numList[i];
            }
        }
        return min;
    }

    public static int maximum(int[] numList)
    {
        int max = numList[0];
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] > max) {
                max = numList[i];
            }
        }
        return max;
    }

    public static void multiplyBy(int[] numList, int multiplier)
    {
        for (int i = 0; i < numList.length; i++) {
            numList[i] *= multiplier;
        }
    }

    public static int[] squares(int[] numList)
    {
        int[] squareList = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            squareList[i] = (int) Math.pow(numList[i], 2);
        }
        return squareList;
    }

    public static void flipBool(boolean[] boolList)
    {
        for (int i = 0; i < boolList.length; i++) {
            boolList[i] = !boolList[i];
        }
    }

    public static String customToString(int[] numList)
    {
        String array = "[";
        for (int i = 0; i < numList.length; i++) {
            array += numList[i] + ",";
            if (i != numList.length - 1) {
                array += " ";
            }
            else {
                array += "]";
            }
        }
        return array;
    }

    public static int longestString(String[] stringList)
    {
        String longest = "";
        for (String str : stringList) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest.length();
    }

    public static void makeUppercase(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++){
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    public static boolean containsPositive(int[] numList)
    {
        for (int num : numList) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsString(String[] stringList, String searchStr)
    {
        for (String str : stringList) {
            if (str.toLowerCase().contains(searchStr.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static String[] makeLowercase(String[] wordList)
    {
        String[] lowerCaseList = new String[wordList.length];
        int i = 0;
        for (String str : wordList) {
            lowerCaseList[i] = str.toLowerCase();
            i++;
        }
        return lowerCaseList;
    }

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2)
    {
        int[] newList = new int[intArr1.length];
        int i = 0;
        int largestNum;
        for (int num : intArr1) {
            if (num > intArr2[i]) {largestNum = num;}
            else {largestNum = intArr2[i];}
            newList[i] = largestNum;
            i++;
        }
        return newList;
    }

    public static int endsInExclamations(String[] stringList)
    {
        int endInExclamNum = 0;
        for (String str : stringList) {
            if (str.charAt(str.length() - 1) == '!') {endInExclamNum++;}
        }
        return endInExclamNum;
    }

    public static int countConsecutiveDoubles(int[] numList)
    {
        int equalToRightNum = 0;
        int i = 0;
        for (int num : numList) {
            if ((i != numList.length - 1) && (num == numList[i + 1])) {equalToRightNum++;}
            i++;
        }
        return equalToRightNum;
    }

    public static int[] shiftLeft(int[] numList)
    {
        int[] shiftedList = new int[numList.length];
        int i = 0;
        for (int num : numList) {
            if (i == 0) {shiftedList[numList.length - 1] = numList[0];}
            else {shiftedList[i - 1] = num;}
            i++;
        }
        return shiftedList;
    }

    public static void shiftLeftModify(int[] numList)
    {
        int a = numList[numList.length-1];
        int b;
        for (int i = numList.length - 1; i >= 0; i--) {
            b = a;
            if (i == 0) {
                numList[numList.length-1] = b;
            }
            else {
                a = numList[i-1];
                numList[i-1] = b;
            }
        }
    }

    public static void shiftNumLeftModify(int[] numList, int shiftNum)
    {
        int[] tempArray = new int[shiftNum];
        for (int i = 0; i < shiftNum; i++) {
            tempArray[i] = numList[i];
        }
        int a = 0;
        for (int i = shiftNum; i < numList.length; i++) {
            numList[a] = numList[i];
            a++;
        }
        int b = 0;
        for (int i = numList.length - shiftNum; i < numList.length; i++) {
            numList[i] = tempArray[b];
            b++;
        }
    }

    public static void shiftNumRightModify(int[] numList, int shiftNum)
    {
        int[] tempArray = new int[shiftNum];
        int tempI = 0;
        for (int i = numList.length-shiftNum; i < numList.length; i++) {
            tempArray[tempI] = numList[i];
            tempI++;
        }
        int a = numList.length-1;
        for (int i = numList.length-1-shiftNum; i >= 0; i--) {
            numList[a] = numList[i];
            a--;
        }
        int b = 0;
        for (int i = 0; i < shiftNum; i++) {
            numList[i] = tempArray[b];
            b++;
        }
    }

    public static int[] reverse(int[] numList)
    {
        int[] reversedArray = new int[numList.length];
        int a = numList.length-1;
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = numList[a];
            a--;
        }
        return reversedArray;
    }

    public static void reverseModify(int[] numList)
    {
        int temp;
        for (int i = 0; i < numList.length/2; i++) {
            temp = numList[i];
            numList[i] = numList[numList.length-1-i];
            numList[numList.length-1-i] = temp;
        }
    }
}