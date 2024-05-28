import java.util.Scanner;

public class reversePartOfArray {
    public static void reverse(int[] nums, int s, int e){
        int sp = s;
        int ep = e;
        while(sp < ep){
            int temp = nums[sp];
            nums[sp] = nums[ep];
            nums[ep] = temp;
            sp++;
            ep--;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int s = scn.nextInt();
        int e = scn.nextInt();

        if(s >= 0 && e >= 0 && s <n && e < n && s <=e){
            reverse(arr, s, e);
        } else {
            System.out.println("Invalid indices");
        }
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }
        scn.close();

    }
}
