import java.util.Scanner;

public class Arrays {


    public static void main(String [] args){
        boolean debug = true;
        int[] intarr = {1, 23, 44, 32};
        double[] doublearr = {12.23, 234.234, 2834234.324, 23849.98232};


        if (debug){
            System.out.println(intarr);
            System.out.println(doublearr);
        }
        System.out.println("test");
        for (int i = doublearr.length - 1; i >= 0; i--){
            System.out.print(doublearr[1]);
            if (i >= 1){
                System.out.print(", ");
            }
        }

    }
}
