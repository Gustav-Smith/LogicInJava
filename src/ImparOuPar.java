public class ImparOuPar {
    public static void main(String[] args) {
        long number = 1212121121221112245l;
        boolean numeroPar = number % 2 == 0;
        if (numeroPar) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
