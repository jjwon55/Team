package JJW_JavaMISSION._03_ThreeSixNine;

public class ThreeSixNine {

	public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            Integer a = i;
            String b = Integer.toString(a);
            int count = 0;

            for (char ch : b.toCharArray()) {
                if (ch == '3' || ch == '6' || ch == '9') {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("*");
            } else if (count == 2) {
                System.out.println("**");
            } else {
                System.out.println(i);
            }
        }
    }
}
	
