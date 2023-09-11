/* 
新規Java ファイル「ComprehensiveBeginner02_01.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

・スロットマシーンプログラムを作成してください。
   1."ゾロ目で大当たり!チャンスは30回"と表示させる
   2."begin と入力してください> " と入力すると、開始するようにする
   3.ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
   4.大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
   5.30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる
*/

import java.util.Random;
import java.util.Scanner;

class ComprehensiveBeginner02_01 {
    public static void main(String[] args) {
        System.out.println("ゾロ目で大当たり!チャンスは30回");
        System.out.print("begin と入力してください> ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("begin")) {
            playSlotMachine();
        } else {
            System.out.println("無効な入力です。プログラムを終了します。");
        }

        scanner.close();
    }

    public static void playSlotMachine() {
        Random random = new Random();
        int chance = 30;

        for (int i = 1; i <= chance; i++) {
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int num3 = random.nextInt(10);

            System.out.println(i + "回目：" + num1 + num2 + num3);

            if (num1 == num2 && num2 == num3) {
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                return;
            }
        }

        System.out.println("残念でした。終わります。");
    }
}
