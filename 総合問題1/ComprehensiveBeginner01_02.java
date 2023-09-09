import java.util.Scanner;

class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3つの整数を入力してください。これらの整数が小さい順（等しくてもよい）に並んでいるかを判定します");

        System.out.print("整数1を入力してください: ");
        int num1 = scanner.nextInt();

        System.out.print("整数2を入力してください: ");
        int num2 = scanner.nextInt();

        System.out.print("整数3を入力してください: ");
        int num3 = scanner.nextInt();
        scanner.close();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
