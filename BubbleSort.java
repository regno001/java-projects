import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Name: Rahul");
System.out.println("Rollno: 47");
System.out.println("Course: BCA, G1");
System.out.print("Enter array size: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter array elements:");
for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
for (int i = 0; i < n - 1; i++)
for (int j = 0; j < n - i - 1; j++)
if (arr[j] > arr[j+1]) {
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
System.out.print("Sorted array: ");
for (int num : arr)
System.out.print(num + " ");
}
} 