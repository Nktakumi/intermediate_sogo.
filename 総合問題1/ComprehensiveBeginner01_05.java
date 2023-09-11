/*
新規Java ファイル「ComprehensiveBeginner01_05.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

・九九の表を、2重の繰り返し(2重for文)を使って表示するプログラムを作成してください。
・2重の繰り返しを使わず単に表示するのは NG
*/

class ComprehensiveBeginner01_05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;

                System.out.print(String.format("%2d ", result));
            }
            System.out.println();
        }
    }
}