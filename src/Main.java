// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        checkChar('a');
    }
    public static void checkChar(char test) {
        if(Character.isDigit(test)){
            System.out.println("è un numero");
        }else{
            throw new ArithmeticException("errore: non è un numero");
        }
    }
}