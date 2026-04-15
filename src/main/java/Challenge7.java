public class Challenge7 {

    public static void main(String[] args){
        String x = "java",y = "10";
        int xint=0,yint=0, sum=0;
        try {
            xint = Integer.parseInt(x);
            yint = Integer.parseInt(y);
        }catch(NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
        sum = xint+yint;
        System.out.println("sum: "+sum);
    }

}
