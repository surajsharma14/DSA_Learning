public class CountingSort {
    public static void countingSort(int[] arr) {
        int max = findMax(arr);
        int[] countArray = new int[max + 1];

        for (int num : arr) {
            countArray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        countingSort(arr);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
