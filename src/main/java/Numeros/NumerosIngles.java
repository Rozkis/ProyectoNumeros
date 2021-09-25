package Numeros;

/*
 Leer un número entre el uno y el 999,999 y mostrar dicho numero en inglés
por ejemplo 3257 = three thousend two hundred fifty seven
123,456 one hundren and twenty three thousend four hundred fifty six
1 one       11 eleven       30 thirty                       
2 two       12 twelve       40 fourty
3 three     13 thirteen     50 fifty
4 four      14 forteen      60 sixty
5 five      15 fifteen      70 seventy
6 six       16 sixteen      80 eighty
7 seven     17 seventeen    90 ninety
8 eight     18 eighteen     100 one hundred
9 nine      19 nineteen     1,000 one thousand
10 ten      20 twenty       100,000 one hundred thousand
874,556 eight hundred seventy four thousand, five hundred fifty six
999,999 nine hundred ninety-nine thousand, nine hundred and ninety-nine
 */


import java.util.Scanner;


public class NumerosIngles {
public static void main(String[] args) {
    int num, U, D, C, UM, DM, CM;    
    String NLetra = ""; //* variable tipo cadena y es igual a una cadena vacia
    System.out.println("Ingresa un numero entre el 1 y el 999,999");
    Scanner teclado = new Scanner(System.in);
    num = teclado.nextInt();
        CM = (int) num / 100000; 
        num = num % 100000; 
        DM = (int) num / 10000; 
        num = num % 10000;
        UM = (int) num / 1000; 
        num = num % 1000;
        C =(int) num / 100; 
        num = num % 100;
        D = (int) num / 10;
        num = num % 10;
        U = num; 
        
    switch (U) {
            case 1:
                NLetra += ("One"); //*uno
                break;
            case 2:
                NLetra += ("Two");//*dos
                break;
            case 3:
                NLetra += ("Three"); //*tres
                break;
            case 4:
                NLetra += ("Four"); //*cuatro
                break;
            case 5:
                NLetra += ("Five"); //*cindo
                break;
            case 6:
                NLetra += ("Six"); //*seis
                break;
            case 7:
                NLetra += ("Seven"); //*siete
                break;
            case 8:
                NLetra += ("Eight"); //*ocho
                break;
            case 9:
                NLetra += ("Nine"); //*nueve
                break;
        
        }
        
    switch (D) {
            case 1:
                NLetra += ("Ten"); //*diez
                break;
            case 2:
                NLetra += ("Eleven"); //*once
                break;
            case 3:
                NLetra += ("Twuelve"); //*doce
                break;
            case 4:
                NLetra += ("Thirteen"); //*trece
                break;
            case 5:
                NLetra += ("Fourteen"); //*catorce
                break;
            case 6:
                NLetra += ("Fiveteen"); //*quince
                break;
            case 7:
                NLetra += ("Sixteen"); //*dieciseis 
                break;
            case 8:
                NLetra += ("Seventeen"); //*diecisiete
                break;
            case 9:
                NLetra += ("Eighteen"); //*dieciocho
                break;
            case 10:
                NLetra += ("Nineteen"); //*diecinueve
                break;
            case 11:
                NLetra += ("twenty"); //*veinte
            case 12:
                NLetra += ("thirty"); //*treinta
                break;
            case 13:
                NLetra += ("forty"); //*cuarenta
                break;
            case 14:
                NLetra += ("fifty"); //*cincuenta
                break;
            case 15:
                NLetra += ("sixty"); //*sesenta
                break;
            case 16:
                NLetra += ("seventy"); //*setenta
                break;
            case 17:
                NLetra += ("eighty"); //*ochenta
                break;
            case 18:
                NLetra += ("ninety"); //*noventa
                break;
        }
        
    
    switch (C) {
            case 1:
                NLetra += ("One hundred"); //*cien
                break;
            case 2:
                NLetra += ("Two hundred"); //*doscientos
                break;
            case 3:
                NLetra += ("Three hundred"); //*trescientos
                break;
            case 4:
                NLetra += ("Four hundred");//*cuatrocientos
                break;
            case 5:
                NLetra += ("Five hundred");//*quinientos
                break;
            case 6:
                NLetra += ("Six hundred"); //*seiscientos
                break;
            case 7:
                NLetra += ("Seven hundred"); //*setecientos
                break;
            case 8:
                NLetra += ("Eight hundred"); //*ochocientos
                break;
            case 9:
                NLetra += ("Nine hundred"); //*novecientos
                break;
        }
    
    
    switch (DM) {
            case 1:
                NLetra += ("Ten thousand"); //* diez mil
                break;
            case 2:
                NLetra += ("Twenty thousand"); //* veinte mil
                break;
            case 3:
                NLetra += ("Thirty thousand"); //* treinta mil
                break;
            case 4:
                NLetra += ("Fourty thousand"); //* cuarenta mil
                break;
            case 5:
                NLetra += ("Fifty thousand"); //* cincuenta mil
                break;
            case 6:
                NLetra += ("Sixty thousand"); //* sesenta mil
                break;
            case 7:
                NLetra += ("Sevety  thousand"); //* setenta mil
                break;
            case 8:
                NLetra += ("Eighty  thousand"); //*ochenta mil
                break;
            case 9:
                NLetra += ("Ninety  thousand");//* noventa mil
                break;
        }
     
    switch (CM) {
            case 1:
                NLetra += ("One hundred thousand");//* cien mil
                break;
            case 2:
                NLetra += ("Two hundred thousand");//* doscientos mil
                break;
            case 3:
                NLetra += ("Three hundred  thousand");//*trescientos mil
                break;
            case 4:
                NLetra += ("Four hundred thousand");//* cuatrocientos mil
                break;
            case 5:
                NLetra += ("Five hundred thousand");//*quinientos mil
                break;
            case 6:
                NLetra += ("Six hundred thousand");//*seiscientos mil
                break;
            case 7:
                NLetra += ("Seven hundred thousand");//* setecientos mil
                break;
            case 8:
                NLetra += ("Eight hundred thousand");//* ochocientos mil
                break;
            case 9:
                NLetra += ("Nine hundred thousand");//* novecientos mil
                break;
        }
    
    
    
    }
   
}
