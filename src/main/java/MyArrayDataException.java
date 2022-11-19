public class MyArrayDataException extends Exception{


    MyArrayDataException(int row, int column) {
        super(String.format("Не правильные значения!![Строка: %d. Столбец: %d.]", row, column ));
        System.out.println();

    }

}
