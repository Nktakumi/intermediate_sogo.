/*
新規Java ファイル「ComprehensiveBeginner01_04.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

・とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
　人数を入力し、入場料の合計を計算するプログラムを作成してください。
*/

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
