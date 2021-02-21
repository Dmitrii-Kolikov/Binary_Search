public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 3, 5, 8, 10, 15, 16, 20};
        System.out.println(binarySearch(array, 16));
    }

    public static int binarySearch(int[] array, int number) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (number < array[middle]) {
                high = middle - 1;
            } else if (number > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
