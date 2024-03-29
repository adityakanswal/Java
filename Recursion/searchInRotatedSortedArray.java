public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 1, 2, 3, 4 };
        int target = 6;
        int n = search(arr, 0, arr.length - 1, target);
        System.out.println(n);

    }

    static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return search(arr, start, mid - 1, target);
            } else {
                return search(arr, mid + 1, end, target);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return search(arr, mid + 1, end, target);
        }

        return search(arr, start, mid - 1, target);

    }
}
