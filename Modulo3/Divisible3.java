package Modulo3;

public class Divisible3 {
    public boolean compruebaDivisiblePor3(String num) {
        int sumaDigitos = 0;
        boolean esDivisible = false;

        for (int i = 0; i < num.length() ; i++) {
            int digito = Integer.parseInt(String.valueOf(num.charAt(i)));
            sumaDigitos += digito;
        }

        if (sumaDigitos % 3 == 0) {
            esDivisible = true;
        } else {
            esDivisible = false;
        }
        return esDivisible;
    }
}
