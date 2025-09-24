import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student fees: ");
        int studentFee = sc.nextInt();
        System.out.print("Enter discount percentage: ");
        int discountPercent = sc.nextInt();

        float discount = (float)studentFee/discountPercent;
        float finalfees = studentFee - discount;

        System.out.println("The discount amount is INR " + discount + " and the final discounted fees is INR " + finalfees);
    }
}