public class Array {
    void linearSearch() {
        int[] arr = {1,2,3,4,5};
        int x = 3;
        int ans = -1;
        for(int i = 0;i < arr.length;i++){
            if (arr[i]==x){
                System.out.println(x + " Element found at index: " + i);
                break;
            } else {
                System.out.println(ans);
            }
        }
    }

    public static void main(String[] args) {
        Array obj = new Array();
        obj.linearSearch();
    }
}
