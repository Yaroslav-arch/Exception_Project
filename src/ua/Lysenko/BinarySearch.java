package ua.Lysenko;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(binarySearch(array, 350));
    }

    public static int binarySearch(int[] array, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = array.length - 1;


        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (array[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
            else if (array[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}
