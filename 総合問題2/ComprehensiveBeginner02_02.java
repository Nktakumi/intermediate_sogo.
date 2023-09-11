/*
新規Java ファイル「ComprehensiveBeginner02_02.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

・ジャンケンプログラムを作成してください。
   1."ジャンケン"と表示させる
   2."0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
     それ以外の数字が入力された場合、エラーとして説明した後に 1. に戻るようにする
   3.今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する
*/

import java.util.Random;
import java.util.Scanner;

class ComprehensiveBeginner02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("ジャンケン");
            System.out.println("0:グー 1:チョキ 2: パー");
            System.out.print("＞数字を入力してください: ");

            int userChoice = scanner.nextInt();

            if (userChoice >= 0 && userChoice <= 2) {
                int computerChoice = random.nextInt(3);
                System.out.println("コンピュータの選択: " + computerChoice);

                // ジャンケンの勝敗判定
                if (userChoice == computerChoice) {
                    System.out.println("引き分け");
                } else if ((userChoice == 0 && computerChoice == 1) ||
                        (userChoice == 1 && computerChoice == 2) ||
                        (userChoice == 2 && computerChoice == 0)) {
                    System.out.println("勝ち");
                } else {
                    System.out.println("負け");
                }
            } else {
                System.out.println("エラー: 0から2の数字を入力してください");
                continue;
            }

            System.out.print("もう一度ジャンケンをプレイしますか？ (0:終了 1:再プレイ): ");
            int playChoice = scanner.nextInt();
            if (playChoice != 1) {
                break;
            }
        }

        scanner.close();
    }
}
