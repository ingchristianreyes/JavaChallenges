public class Challenge6{

    static int staticBlockCounter;

    static int instanceBlockCounter;

    static{
        staticBlockCounter++;
    }

    {
        instanceBlockCounter++;
    }

    Challenge6(){

    }

    public static void main(String[] args){
        Challenge6 challenge6_1 = new Challenge6();
        Challenge6 challenge6_2 = new Challenge6();
        Challenge6 challenge6_3 = new Challenge6();

        System.out.println("Static block executions: "+Challenge6.staticBlockCounter);
        System.out.println("Instance block executions: "+Challenge6.instanceBlockCounter);
    }
}
