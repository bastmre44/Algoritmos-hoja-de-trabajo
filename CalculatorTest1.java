import java.util.ArrayList;

public class CalculatorTest1 {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            ArrayList<String> ex = calculator.read("prueba.txt");

            for (String expression : ex) {
                ArrayList<Character> elementos = new ArrayList<>();
                for (char a : expression.toCharArray()) {
                    if (a != ' ') {
                        elementos.add(a);
                    }
                }
                int result = calculator.solve(elementos);
                System.out.println("El resultado es: " + result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
