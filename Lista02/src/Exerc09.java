import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite os objetos separados por espaço: ");
        String[] arr = input.nextLine().split(" ");
        int n = arr.length;
        permute(arr, 0, n-1);
        input.close();
    }
    
    private static void permute(String[] arr, int l, int r) {
        if (l == r) {
            printArray(arr);
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l+1, r);
                swap(arr, l, i);
            }
        }
    }
    
    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
