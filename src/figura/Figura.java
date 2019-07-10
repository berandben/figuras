package figura;

/**
 *
 * @author Ber&ben
 */
public class Figura {

    public static void main(String[] args) {

        System.out.println("\nFIGURA A--------------");

        for (int i = 0; i < 10; i++) {

            System.out.println("");

            for (int j = 0; j < 10; j++) {
                System.out.print(" o");
            }

        }

        System.out.println("\nFIGURA B--------------");

        for (int i = 0; i < 10; i++) {

            System.out.print(" o");

        }

        for (int i = 0; i < 8; i++) {
            System.out.println("");

            for (int j = 0; j < 10; j++) {

                if (j == 0 || j == 9) {

                    System.out.print(" o");

                } else {

                    System.out.print("  ");
                }

            }

        }
        System.out.println("");

        for (int i = 0; i < 10; i++) {

            System.out.print(" o");

        }

        System.out.println("\nFIGURA C--------------");

        for (int i = 0; i < 10; i++) {

            System.out.println("");

            for (int j = 0; j <= 10 + (i - 10); j++) {

                System.out.print(" o");

            }

        }

        System.out.println("\nFIGURA D--------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("");

            for (int j = 0; j <= 10; j++) {

                if (j <= i) {

                    System.out.print("  ");

                } else {

                    System.out.print(" o");
                }

            }

        }

        System.out.println("\nFIGURA E--------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("");

            for (int j = 0; j <= 10; j++) {

                if (j < 10 - i) {

                    System.out.print("  ");

                } else {

                    System.out.print(" o");
                }

            }

        }

        System.out.println("\nFIGURA F--------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("");

            for (int j = 0; j < 10 - i; j++) {

                System.out.print(" o");

            }

        }

        System.out.println("\nFIGURA G--------------");

        for (int i = 0; i <= 11 / 2 - 1; i++) {

            System.out.println("");

            for (int j = 0; j < 11; j++) {

                if (j >= 11 / 2 - i && j <= 11 / 2 + i) {

                    System.out.print(" o");

                } else {

                    System.out.print("  ");

                }

            }

        }

        System.out.println("");
        for (int i = 0; i < 11; i++) {

            System.out.print(" o");

        }

        for (int i = 0; i <= 11 / 2 - 1; i++) {

            System.out.println("");

            for (int j = 0; j <= 10; j++) {

                if (j >= i + 1 && j < 11 - 1 - i) {

                    System.out.print(" o");

                } else {

                    System.out.print("  ");

                }

            }

        }

    }

}
