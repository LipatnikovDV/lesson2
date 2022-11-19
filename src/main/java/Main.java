public class Main {

    public static void main(String[] args) {

        System.out.println("\nПровека массива №1");
        String[][] arr1 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };

        try {
            System.out.println("Сумма чисел равна " + Convert.strConvert(arr1));
        } catch (MyArrayDataException | MyArraySizeException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Проверка массива №1 окончена");
        System.out.println();

        System.out.println("\nПровека массива №2");
        String[][] arr2 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},  /* изменен размер массива */
        };
        try {
            System.out.println("Сумма чисел равна " + Convert.strConvert(arr2));
        } catch (MyArrayDataException | MyArraySizeException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Проверка массива №2 окончена");
        System.out.println();

        System.out.println("\nПровека массива №3");
        String[][] arr3 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3"/*, "4"*/},   /* изменен размер массива */
        };
        try {
            System.out.println("Сумма чисел равна " + Convert.strConvert(arr3));
        } catch (MyArrayDataException | MyArraySizeException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Проверка массива №3 окончена");
        System.out.println();
    }

}

