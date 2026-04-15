import java.util.Random;

public class Challenge4 {
    public static void main(String[] args) {
        Random r = new Random();
        int max = 200;
        int min = 100;
        for (int i=1; i<= 20; i++)
        {
            System.out.println(r.nextInt(max-min+1)+min);


        }
    }
}
