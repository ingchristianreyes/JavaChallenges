public class Challenge8 {
    void access(){
        this.m1();
        this.m2();
    }
    static void m1(){
        System.out.println("Static m1 method");
    }
    void m2(){
        System.out.println("non-Static m2 method");
    }
    public static void main(String[] args){
        Challenge8 challenge8=new Challenge8();
        challenge8.access();
    }
}
