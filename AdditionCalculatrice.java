public class AdditionCalculatrice {
    public static void main(String[] args) {
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        double sum = number1 + number2;
        System.out.println("La somme des deux nombres est: " + sum);
    }
}
