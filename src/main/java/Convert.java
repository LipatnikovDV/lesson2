public class Convert {
    static int strConvert(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;

        if (4 != arr.length)
            throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            if (4 != arr[i].length)
                throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }

            }

        }
        return sum;
    }
}

