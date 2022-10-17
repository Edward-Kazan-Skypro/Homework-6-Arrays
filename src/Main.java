public class Main {
    public static void main(String[] args) {

        //Задание 1
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57, 7.654, 9.986};

        byte[] byteArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Задание 2
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) System.out.print(", ");
        }
        System.out.println();

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) System.out.print(", ");
        }
        System.out.println();

        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i]);
            if (i < byteArray.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println();

        //Задание 3
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        for (int i = byteArray.length - 1; i >= 0; i--) {
            System.out.print(byteArray[i]);
            if (i > 0) System.out.print(", ");
        }

        System.out.println();
        System.out.println();

        //Задание 4
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i]++;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) System.out.print(", ");
        }
    }
}
