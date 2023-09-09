import java.util.Scanner;

class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        // Scannerオブジェクトを作成して、ユーザーから整数を入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");

        int number = scanner.nextInt();
        scanner.close();

        // 入力された整数が偶数か奇数かを判定して表示
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
