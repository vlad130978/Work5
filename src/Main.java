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
    //Задача 3
        for (int i = weight.length-1; i >= 0 ; i--)
            System.out.print(weight[i] + ",");
        System.out.print("\r\n");
        for (int a = doubleArr.length-1; a >= 0 ; a--)
            System.out.print(doubleArr[a]+",");
        System.out.print("\r\n");
        for (int b = intArray.length-1; b >= 0 ; b--)
            System.out.print(intArray[b]+",");
        System.out.print("\r\n");

    // Задача 4
        int[] weight3 = new int[]{1, 2, 3};
        for (int x = 0; x < weight3.length; x++);
        System.out.print(weight[0] + ",");

    }
}