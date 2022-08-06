public class Main {
    public static void main(String[] args) {
    // Задача1
        int[] weight = new int[]{1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        int[] intArray = { 1, 2, 3, 4, 5 };
    // Задача2
        for (int i = 0; i < weight.length; i++)
            System.out.print(weight[i] + ",");
        System.out.print("\r\n");
        for (int a = 0; a < doubleArr.length; a++)
            System.out.print(doubleArr[a]+",");
        System.out.print("\r\n");
        for (int b = 0; b < intArray.length;)
            System.out.print(intArray[b++]+",");
        System.out.print("\r\n");
    }
}