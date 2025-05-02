
public class Pattern_2 {

    public static void main(String[] args) {

        char alphabet = 'A';
        int n = 1;

        System.out.print("Pattern 1 = \n");

        for (int i = 0; i < 4; i++) {

            for (int k = 0; k < 4 - i; k++) {

                System.out.print(" ");

            }
            for (int j = 1; j < i + 2; j++) {

                if (i % 2 == 0) {
                    System.out.print(n + " ");
                    n++;
                } else {
                    System.out.print(alphabet + " ");
                    alphabet++;
                }

            }
            System.out.print("\n");
        }

        System.out.print("\nPattern 2 = \n");

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 9 - (2 * i); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\nPattern 3 = \n");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 9; j++) {

                while (j > (4 - i) && j < 5 + i) {

                    for (int k = 1; k < i*2; k++) {

                        System.out.print(" ");
                        j++;

                    }
                    break;

                }
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

}
