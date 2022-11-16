public class Main {
    public static void main(String[] args) {
        for (int j = 1; j <= 6; j ++)
        {
            for (int i = 0; i < j; i ++)
            {
                System.out.print(" ");
            }
            for (int h = 0; h < j; h ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int result = 0;
        int m = 0;
        while (m < 3) {
            int k = 0;
            while (k < 4) {
                result++;
                k++;
                System.out.print("k: " + k);
                System.out.println(", m: " + m);
            }
            m++;
        }
        System.out.println("result: " + result);
    }
}
