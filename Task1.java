
import java.io.*;

class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = input.nextInt();
        System.out.print("Enter the end number: ");
        int end = input.nextInt();
        if (start > end) {
            System.out.println("Something is wrong! Maybe you inputed a start number that is larger than the end number!");
        }
        else {
            int sum = 0;
            for (int cnt = start; cnt <= end; cnt++) {
                sum += cnt;
            }
            System.out.printf("%d%n", sum);
        }
        input.close();
    }
}
