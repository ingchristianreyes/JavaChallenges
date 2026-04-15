public class Challenge2 {
    public Challenge2() {
        System.out.println("First Constructor");
    }
    public Challenge2(int i) {
        this();
        System.out.println("Second Constructor - " + i);
    }
    public Challenge2(int j,String k) {
        this(2);
        System.out.println("Third Constructor " + j +" " + k);
    }
    public static void main(String[] args) {
        new Challenge2(20,"Main");
    }
}
