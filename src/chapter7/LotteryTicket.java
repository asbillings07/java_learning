package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    // constant
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNum;

            // generate random number then search the arr to make sure it doesn't contain that number
            // before placing it in the arr.
            do {
                randomNum = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNum));

            ticket[i] = randomNum;
        }

        return  ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param arr Array to search through
     * @param numToSearchFor Value to search for
     * @return true if found, false if not
     */

    public static boolean search(int[] arr, int numToSearchFor) {
        /*
        Enhanced loop:
        Iterates through array and each time assigns the current element value
         */

        for (int value : arr) {
            if (value == numToSearchFor) {
                return true;
            }
        }

        return false;
    }

    public static boolean binarySearch(int[] arr, int numToSearchFor) {
        // Array must be sorted first
        Arrays.sort(arr);
//        Arrays.binarySearch(arr, numToSearchFor);
        int index = biSearch(arr, 0, arr.length, numToSearchFor);

        if (index >= 0) {
            return true;
        }
            return false;
    }

    private static int biSearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while(low <= high) {
            int mid = low + high >>> 1;
            int midVal = a[mid];
            if (midVal < key) {
                low = mid + 1;
            } else {
                if (midVal <= key) {
                    return mid;
                }

                high = mid - 1;
            }
        }

        return -(low + 1);
    }

    public static void printTicket(int[] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
