import java.util.ArrayList;
// Clase que contiene el método main para probar la clase Calculator

public class CalculatorTest1 {
    public static void main(String[] args) {
        try {
            // instancia de la clase Calculator
            Calculator calculator = new Calculator();
     // Se lee el contenido del archivo "prueba.txt" y se almacena en un ArrayList

            ArrayList<String> ex = calculator.read("prueba.txt");
            
            for (String expression : ex) {
                ArrayList<Character> elementos = new ArrayList<>();
                 // Se recorre cada caracter de la expresión
                for (char a : expression.toCharArray()) {
                    if (a != ' ') {
                        elementos.add(a);
                    }
                }
                
                // Se resuelve la expresión y se obtiene el resultado
                int result = calculator.solve(elementos);
                 // Se imprime el resultado
                System.out.println("El resultado es: " + result);
            }
        } catch (Exception e) {
            //se imprime error
            e.printStackTrace();
        }
    }
}
