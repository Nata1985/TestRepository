public class Lesson02 {
    public static void main(String args[]) {
        checkSumSign(5, 7);
        isPositiveOrNegative(5);
		boolean result = isNegative(6);
        System.out.println(result);
		printWordNTimes("рорр", 5);
    }
    public static void checkSumSign(int a, int b) {
       
        int result = a + b;
        if (result == 10 && result <= 20) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if (x <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void printWordNTimes(String word, int times) {
        for (int a = 1; a < 7; a++) {
            System.out.println(" STR"+ a );
        }
    }
	
}
