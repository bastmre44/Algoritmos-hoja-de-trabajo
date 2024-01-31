import java.util.ArrayList;
//Interfaz para la calculadora 

public interface ICalculator {


    //métodos que se van a usar en la calculadora , suma, resta, multiplicación y división 
    public int add(int n1, int n2); // +

    public int substraction(int n1, int n2); // -

    public int multiplication(int n1, int n2); // *

    public int division(int n1, int n2); // /

    public int residue(int n1, int n2) throws Exception; // /

    public ArrayList<String> read(String characterString) throws Exception;

    public int solve(ArrayList<Character> elements) throws Exception;

}
