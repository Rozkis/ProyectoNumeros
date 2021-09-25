/*
 * Leer un numero del 1 al 3000 y mostrar dicho numero en romano
ejemplo 1280 = MCCLXXX; 666 = DCLXVI
M=1000
D=500
C=100
L=50
X=10
V=5
I=1
 */
package Numeros;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Romanos {
    public Romanos (){
     
    }
    
    public static void main(String[] args) {
        int numero, U, C, D, UM; //* se declaran las variables, unidades, decenas, centenas unidades de millar
        String NLetra = ""; //* variable tipo cadena y es igual a una cadena vacia
        System.out.println("Ingresa un numero entre el 1 y el 3999");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        // numero=2666;
        UM = (int) numero / 1000;
        numero = numero % 1000;  //* el simbolo de % toma el residuo
        C = (int) numero / 100;
        numero = numero % 100;
        D = (int) numero / 10;
        numero = numero % 10;
        U = numero;
        switch (UM) {
            case 1:
                NLetra = NLetra + ("M");
                break;
            case 2:
                NLetra += ("MM");
                break;
            case 3:
                NLetra += ("MMM");
                break;
        }

        switch (C) {
            case 1:
                NLetra += ("C");
                break;
            case 2:
                NLetra += ("CC");
                break;
            case 3:
                NLetra += ("CCC");
                break;
            case 4:
                NLetra += ("CD");
                break;
            case 5:
                NLetra += ("D");
                break;
            case 6:
                NLetra += ("DC");
                break;
            case 7:
                NLetra += ("DCC");
                break;
            case 8:
                NLetra += ("DCCC");
                break;
            case 9:
                NLetra += ("CM");
                break;
        }

        switch (D) {
            case 1:
                NLetra += ("X");
                break;
            case 2:
                NLetra += ("XX");
                break;
            case 3:
                NLetra += ("XXX");
                break;
            case 4:
                NLetra += ("XL");
                break;
            case 5:
                NLetra += ("L");
                break;
            case 6:
                NLetra += ("LX");
                break;
            case 7:
                NLetra += ("LXX");
                break;
            case 8:
                NLetra += ("LXXX");
                break;
            case 9:
                NLetra += ("XC");
                break;
        }

        switch (U) {
            case 1:
                NLetra += ("I");
                break;
            case 2:
                NLetra += ("II");
                break;
            case 3:
                NLetra += ("III");
                break;
            case 4:
                NLetra += ("IV");
                break;
            case 5:
                NLetra += ("V");
                break;
            case 6:
                NLetra += ("VI");
                break;
            case 7:
                NLetra += ("VII");
                break;
            case 8:
                NLetra += ("VIII");
                break;
            case 9:
                NLetra += ("IX");
                break;
        }
        System.out.println("EL NUMERO ROMANO ES : " + NLetra);

    }
    
    
public String regresanumletra(int num) {
        
        int numero, U, C, D, UM; //* se declaran las variables, unidades, decenas, centenas unidades de millar
        String NLetra = ""; //* variable tipo cadena y es igual a una cadena vacia
    //*    System.out.println("Ingresa un numero entre el 1 y el 3999");
    //*    Scanner teclado = new Scanner(System.in);
    //*    numero = teclado.nextInt();
        // numero=2666;
        numero = num;
        UM = (int) numero / 1000;
        numero = numero % 1000;  //* el simbolo de % toma el residuo
        C = (int) numero / 100;
        numero = numero % 100;
        D = (int) numero / 10;
        numero = numero % 10;
        U = numero;
        switch (UM) {
            case 1:
                NLetra = NLetra + ("M");
                break;
            case 2:
                NLetra += ("MM");
                break;
            case 3:
                NLetra += ("MMM");
                break;
        }

        switch (C) {
            case 1:
                NLetra += ("C");
                break;
            case 2:
                NLetra += ("CC");
                break;
            case 3:
                NLetra += ("CCC");
                break;
            case 4:
                NLetra += ("CD");
                break;
            case 5:
                NLetra += ("D");
                break;
            case 6:
                NLetra += ("DC");
                break;
            case 7:
                NLetra += ("DCC");
                break;
            case 8:
                NLetra += ("DCCC");
                break;
            case 9:
                NLetra += ("CM");
                break;
        }

        switch (D) {
            case 1:
                NLetra += ("X");
                break;
            case 2:
                NLetra += ("XX");
                break;
            case 3:
                NLetra += ("XXX");
                break;
            case 4:
                NLetra += ("XL");
                break;
            case 5:
                NLetra += ("L");
                break;
            case 6:
                NLetra += ("LX");
                break;
            case 7:
                NLetra += ("LXX");
                break;
            case 8:
                NLetra += ("LXXX");
                break;
            case 9:
                NLetra += ("XC");
                break;
        }

        switch (U) {
            case 1:
                NLetra += ("I");
                break;
            case 2:
                NLetra += ("II");
                break;
            case 3:
                NLetra += ("III");
                break;
            case 4:
                NLetra += ("IV");
                break;
            case 5:
                NLetra += ("V");
                break;
            case 6:
                NLetra += ("VI");
                break;
            case 7:
                NLetra += ("VII");
                break;
            case 8:
                NLetra += ("VIII");
                break;
            case 9:
                NLetra += ("IX");
                break;
        }
    //*    System.out.println("EL NUMERO ROMANO ES : " + NLetra);
    return NLetra;        
    }
}
