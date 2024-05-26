public class Chec {
    public static int lastOccurrence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2};
        int x = 3;
        int lastIndex = lastOccurrence(arr, x);
        if (lastIndex != -1) {
            System.out.println("The last occurrence of " + x + " is at index " + lastIndex);
        } else {
            System.out.println(x + " is not in the array");
        }
    }
}