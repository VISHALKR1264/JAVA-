
public class pattern {

    public static void triangle_reverse_pattern() {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf("X");
            }
            System.out.println();
        }
    }

    public static void triangle_pattern() {

        for (int i = 1; i <= 4; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.printf("X");
            }
            System.out.println();
        }
    }

    public static void triangle_bothside_pattern() {

        for (int i = 1; i <= 4; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.printf("X");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf("X");
            }
            System.out.println();
        }

    }

    public static void triangle_bothside2_pattern() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("X");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.printf("X");
            }
            System.out.println();
        }

    }

    public static void triangle_reverse2_pattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("X");
            }
            System.out.println();
        }
    }

    public static void triangle_reverse3_pattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.printf("X");
            }
            System.out.println();
        }
    }

    public static void triangle_reverse4_pattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("X");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print("X");
            }
            System.out.println();
        }

    }

    public static void triangle_reverse5_pattern() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.printf("X");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("X");
            }
            System.out.println();
        }
    }

    public static void pyramid_pattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf(" X");
            }
            System.out.println();
        }
    }

    public static void pyramid2_pattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.printf(" X");
            }
            System.out.println();
        }
    }

    public static void pyramid3_pattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.printf(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.printf("X");
            }
            for (int l = 2; l <= i; l++) {

                System.out.printf("X");

            }
            System.out.println();
        }

    }

    public static void pyramid4_pattern() {
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.printf("X");
            }
            for (int m = 3; m >= i; m--) {
                System.out.printf("X");
            }
            System.out.println();
        }

    }

    public static void diagonal_patern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i >= 2 && j <= i - 1)
                    System.out.printf(" ");
                else
                    System.out.printf("X");
            }
            System.out.println();
        }

        //////////////////////////////////////// another method by square;
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // if (i == j )
        // System.out.printf("X");
        // else {
        // System.out.printf(" ");
        // }
        // }

        // System.out.println();
        // }
    }

    public static void diagonal2_patern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i >= 2 && k > 1) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("X");
                }
            }
            System.out.println();
        }
    }

    public static void special_patern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.printf(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                if (k > 1 && k < (i * 2) - 1) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("X");
                }
            }
            // for(int m=2;m<=i;m++)
            // {
            // System.out.printf("X");

            // }
            System.out.println();
        }
    }

    public static void square_patern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("X");
            }
            System.out.println();
        }
    }

    public static void cross_star_patern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 5 - 1)
                    System.out.printf("X");
                else {
                    System.out.printf(" ");
                }
            }

            System.out.println();
        }
    }

    public static void square2_patern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 5) {
                    System.out.printf("X");
                } else
                    System.out.printf(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle_pattern();
        System.out.println();
        triangle_reverse_pattern();
        System.out.println();
        triangle_bothside_pattern();
        System.out.println();
        triangle_bothside2_pattern();
        System.out.println();
        triangle_reverse2_pattern();
        System.out.println();
        triangle_reverse3_pattern();
        System.out.println();
        triangle_reverse4_pattern();
        System.out.println();
        triangle_reverse5_pattern();
        System.out.println();
        pyramid_pattern();
        System.out.println();
        pyramid2_pattern();

        System.out.println();
        pyramid3_pattern();
        System.out.println();
        pyramid4_pattern();
        System.out.println();
        diagonal_patern();
        System.out.println();
        diagonal2_patern();

        System.out.println();
        special_patern();

        System.out.println();
        square_patern();
        System.out.println();
        cross_star_patern();

        System.out.println();
        square2_patern();
    }
}
