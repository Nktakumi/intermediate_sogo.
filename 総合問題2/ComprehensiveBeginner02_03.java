/*
新規Java ファイル「ComprehensiveBeginner02_03.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

・以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
・buyDrink() メソッドを持つ、Coffee クラスを使用する
・buyDrink() メソッドを持つ、Juice クラスを使用する

バヤリース の オレンジ 味です。130 円になります。
午後の紅茶 の レモンティー 味です。150 円になります。
ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
*/

class Coffee {
    private String brand;
    private String flavor;
    private String sweetness;
    private String milk;
    private int price;

    public Coffee(String brand, String flavor, String sweetness, String milk, int price) {
        this.brand = brand;
        this.flavor = flavor;
        this.sweetness = sweetness;
        this.milk = milk;
        this.price = price;
    }

    public void buyDrink() {
        System.out.print(brand);

        if (!flavor.isEmpty()) {
            System.out.print(" の " + flavor + " 味です.");
        }

        if (!sweetness.isEmpty()) {
            System.out.print(" 甘さは " + sweetness + ",");
        }

        if (!milk.isEmpty()) {
            System.out.print(" ミルク " + milk + "。");
        }

        System.out.println(" " + price + " 円になります。");
    }
}

class Juice {
    private String brand;
    private String flavor;
    private int price;

    public Juice(String brand, String flavor, int price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    public void buyDrink() {
        System.out.println(brand + " の " + flavor + " 味です。" + price + " 円になります。");
    }
}

class ComprehensiveBeginner02_03 {
    public static void main(String[] args) {
        Juice juice1 = new Juice("バヤリース", "オレンジ", 130);
        Juice juice2 = new Juice("午後の紅茶", "レモンティー", 150);
        Coffee coffee1 = new Coffee("ボス", "", "控え目", "無しです", 110);
        Coffee coffee2 = new Coffee("ジョージア", "", "甘め", "入りです", 120);

        juice1.buyDrink();
        juice2.buyDrink();
        coffee1.buyDrink();
        coffee2.buyDrink();
    }
}
