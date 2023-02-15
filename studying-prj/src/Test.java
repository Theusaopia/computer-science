public class Test {
    public static void main(String[] args) {
//        printPrimes(20);

        int[][] pt = pascalTriangle(10);
        int space = 10;
        for(int i = 0; i < pt.length; i++) {
            for(int k = 0; k <= space; k++) System.out.print(" ");
            for(int j = 0; j < pt.length; j++) {
                if(j > i) break;
                System.out.print(pt[i][j] + " ");
            }
            space--;
            System.out.println();
        }
    }

    /**
     * origin: https://archive.org/details/ucberkeley_webcast_Wp8oiO_CZZE
     * theme: arrays
     * type: example
     * **/
    public static void printPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        int i;

        // setting all numbers 2...n as possible primes
        for(i = 2; i <= n; i++) {
            prime[i] = true;
        }

        /*
        * The check divisor * divisor is because I can stop the algorithm when divisor <= sqrt(n)
        * This way I have a guarantee that I've checked all the smaller divisors
        * As I can always start marking divisor starting from pow(number, 2)
        * */
        for(int divisor = 2; divisor * divisor <= n; divisor++) { // runs through the numbers
            if(prime[divisor]) { // check prime
                for(i = 2 * divisor; i <= n; i = i + divisor) { // runs through the divisors
                    prime[i] = false; // if divisor, it's not a prime
                }
            }
        }

        //print the numbers
        for(i = 2; i <= n; i++) {
            if(prime[i]) {
                System.out.print(" " + i);
            }
        }
    }

    /**
     * origin: https://archive.org/details/ucberkeley_webcast_Wp8oiO_CZZE
     * theme: multidimensional arrays
     * type: example
     * **/
    public static int[][] pascalTriangle(int n) { // number of rows
        int[][] pt = new int[n][]; // begin new multidimensional array with n rows

        for(int i = 0; i < n; i++) { // runs through the rows
            pt[i] = new int[i + 1]; // begin the sub-array
            pt[i][0] = 1; // put the first one
            for(int j = 1; j < i; j++) { // runs through the columns
                pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j]; // sum the values
            }
            pt[i][i] = 1; // put the last one
        }

        return pt;
    }
}
