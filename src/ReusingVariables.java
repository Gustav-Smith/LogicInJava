public class ReusingVariables {
    public static void main(String[] args) {
        double salary = 5000;
        double result = salary * 0.3;
        System.out.println("30% is: "+ result);
        result = salary * 0.15;
        System.out.println("15% is: "+ result);
        result = salary * 0.05;
        System.out.println("5% is: "+ result);
    }
}
