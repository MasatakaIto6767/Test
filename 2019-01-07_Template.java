public class Template {
    String name;
    String details;
    int price;

    void name() {
        System.out.println(name + "様");
        System.out.println(name + "様のお買上げ明細は次のとおりです。");
    }

    void items() {
        System.out.println(details + " ; " + price + "円");
    }

    void total() {
        System.out.println("---------------------------");
        System.out.println("合計 ; " + price + "円");
    }
}

