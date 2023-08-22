public class pattern {

    public static void Pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    
    static void Pattern2(int n) {
        for (int i = 0; i<n ; i++) {
            for (int j = n; j>i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }

    static void Pattern4(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {

            if(i%2==0) {
                start=1;
            }
            else {
                start=0;
            }
            for (int j = 0; j <=i; j++) {
                if(i==j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(start);
                }
                start = 1-start;
            }
            System.out.println();
        }
    }
    
    static void Pattern5(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
    static void Pattern6(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Pattern1(5);
//        Pattern2(5);
//        Pattern3(5);
//        Pattern4(5);
//        Pattern5(5);
        Pattern6(5);
    }

}
