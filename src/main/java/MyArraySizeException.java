public class MyArraySizeException extends Exception{
    MyArraySizeException() {
        super(String.format("Не правильное значение размера массива! Должен быть 4х4."));
        System.out.println();
    }

}
