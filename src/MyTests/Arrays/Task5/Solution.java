package src.MyTests.Arrays.Task5;

public class Solution {

    private int[] workArray;

    public Solution(int[] elements, int[] weight) {

        int weights = 0;
        for (int k : weight) {
            weights += k;
        }

        int[] workArray = new int[weights];

        int index = 0;

        for (int i = 0; i < weight.length; i++) {
            for (int j = 0; j < weight[i]; j++) {
                workArray[index] = elements[i];
                index++;
            }
        }
    }

    public int getRandom() {
        return workArray[(int) (Math.random() * workArray.length - 1)];
    }
}
