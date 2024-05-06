public class ImparOuPar {
    public static void main(String[] args) {
        long numero = 1212121121221112245l;
        boolean numeroPar = numero % 2 == 0;
        if (numeroPar) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
