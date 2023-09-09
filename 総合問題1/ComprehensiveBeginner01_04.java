import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("入場者の人数を入力してください: ");

        int numberOfVisitors = scanner.nextInt();
        scanner.close();

        int admissionFee;

        if (numberOfVisitors >= 20) {
            admissionFee = 500;
        } else if (numberOfVisitors >= 5) {
            admissionFee = 550;
        } else {
            admissionFee = 600;
        }

        int totalCost = numberOfVisitors * admissionFee;

        System.out.println("合計金額: " + totalCost + "円");
    }
}
