/*
新規Java ファイル「ComprehensiveBeginner01_03.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

・2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
  2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。
*/

import java.util.Scanner;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("2次方程式 ax^2 + bx + c = 0 の係数を入力してください。");

        System.out.print("係数aを入力してください: ");
        double a = scanner.nextDouble();

        System.out.print("係数bを入力してください: ");
        double b = scanner.nextDouble();

        System.out.print("係数cを入力してください: ");
        double c = scanner.nextDouble();
        scanner.close();

        System.out.println("入力された2次方程式は以下の通りです:");
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("2つの実数解があります");
        } else if (discriminant == 0) {
            System.out.println("重解があります");
        } else {
            System.out.println("2つの虚数解があります");
        }
    }
}