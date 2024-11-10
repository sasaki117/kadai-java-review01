
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int goods = 1200;

        tax(goods);

        System.out.println(goods + "円の商品の税込み価格は" + (goods + tax(goods)) + "円（消費税額は" + tax(goods) + "円）です。");
    }

    public static int tax(int price) {
        int taxrate = 10;
        int result = price / taxrate;
        return result;
    }
}
