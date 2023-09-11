/*
新規Java ファイル「ComprehensiveBeginner01_01.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

・整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成してください。
*/

import java.util.Scanner;

class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");

        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
