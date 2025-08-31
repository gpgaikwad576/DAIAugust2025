package theory;

public class Prime {
    public static void main(String args[]) {
        int i, mid = 0, flag = 0;
        int number = 12;//it is the number to be checked
        mid = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not prime number");
        } else {
            for (i = 2; i <= mid; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(number + " is a prime number");
            }
        }
    }
}
