/*
Leer un número entre el uno y el 159,999 y mostrar dicho numero en p"urepecha
1=ma
2=tsimani
3=tanimu
4=t"amu
5=iumu
6=kuimu
7=iumu tsimani
8=iumu tanimu
9=iumu t"amu
10=tembeni
 */
package Numeros;

import javax.swing.JOptionPane;

public class NumPurepecha {

    public static void main(String[] args) {
        String[] arregloNumeros = {"ma", "tsimáni", "tanímu", "t’amu", "iúmu", "kuímu", "iúmu tsimáni", "iúmu tanímu", "iúmu t’amu", "témbeni", "témbeni ma", "témbeni tsimáni", "témbeni tanímu", "témbeni t’amu", "témbeni iúmu", "témbeni kuímu", "témbeni iúmu tsimáni", "témbeni iúmu tanímu", "témbeni iúmu t’amu"};
        int num, cociente400, residuo400, veintes400, unidades400, veintes, unidades;
        String numerosPurepecha = "";
        String valor;
        do {
            valor = (JOptionPane.showInputDialog("Dame un número entre 1 y 159,999"));
            System.out.println(isNumeric(valor));
        } while (!(isNumeric(valor)));
        num = Integer.parseInt(valor);
        cociente400 = (int) num / 400;
        residuo400 = num % 400;
        veintes400 = (int) cociente400 / 20;
        unidades400 = cociente400 % 20;
        veintes = (int) residuo400 / 20;
        unidades = (int) residuo400 % 20;
//        System.out.println(arregloNumeros[veintes400 - 1]);
//        System.out.println("ekuátse");
//        System.out.println(arregloNumeros[unidades400 - 1]);
//        System.out.println("irepita");
//        System.out.println(arregloNumeros[veintes - 1]);
//        System.out.println("ekuátse");
//        System.out.println(arregloNumeros[unidades - 1]);
        if (veintes400 > 0) {
            numerosPurepecha = numerosPurepecha + arregloNumeros[veintes400 - 1] + " ekuátse ";

        }
        if (unidades400 > 0) {
            numerosPurepecha = numerosPurepecha + arregloNumeros[unidades400 - 1] + " irepita ";
        }
        if (veintes > 0) {
            numerosPurepecha = numerosPurepecha + arregloNumeros[veintes - 1] + " irepita ";
        }
        if (unidades > 0) {
            numerosPurepecha = numerosPurepecha + arregloNumeros[unidades - 1];
        }
        JOptionPane.showMessageDialog(null, numerosPurepecha);
    }

    public static boolean isNumeric(String cad) {
        if (cad == null) {
            return false;

        }
        try {
            int numero = Integer.parseInt(cad);
        } catch (Exception e) {
            return false;
        }
        return true;

    }

    public String regresanumeroaletra(int numero) {
        String[] arregloNumeros = {"ma", "tsimáni", "tanímu", "t’amu", "iúmu", "kuímu", "iúmu tsimáni", "iúmu tanímu", "iúmu t’amu", "témbeni", "témbeni ma", "témbeni tsimáni", "témbeni tanímu", "témbeni t’amu", "témbeni iúmu", "témbeni kuímu", "témbeni iúmu tsimáni", "témbeni iúmu tanímu", "témbeni iúmu t’amu"};
        int num, cociente400, residuo400, veintes400, unidades400, veintes, unidades;
        String numerosPurepecha = "";
    //*    String valor;
    //*    do {
    //*       valor = (JOptionPane.showInputDialog("Dame un número entre 1 y 159,999"));
    //*    System.out.println(isNumeric(valor));
    //*    } while (!(isNumeric(valor)));
    //*    num = Integer.parseInt(valor);
        num=numero;
        cociente400 = (int) num/ 400;
        residuo400 = num % 400;
        veintes400 = (int) cociente400 / 20;
        unidades400 = cociente400 % 20;
        veintes = (int) residuo400 / 20;
        unidades = (int) residuo400 % 20;
//        System.out.println(arregloNumeros[veintes400 - 1]);
//        System.out.println("ekuátse");
//        System.out.println(arregloNumeros[unidades400 - 1]);
//        System.out.println("irepita");
//        System.out.println(arregloNumeros[veintes - 1]);
//        System.out.println("ekuátse");
//        System.out.println(arregloNumeros[unidades - 1]);
        if (veintes400 > 0) {
            numerosPurepecha = numerosPurepecha + arregloNumeros[veintes400 - 1] + " ekuátse ";

        }
        if (unidades400 > 0) {
            numerosPurepecha = numerosPurepecha + arregloNumeros[unidades400 - 1] + " irepita ";
        }
        if (veintes > 0) {
            numerosPurepecha = numerosPurepecha + arregloNumeros[veintes - 1] + " irepita ";
        }
        if (unidades > 0) {
            numerosPurepecha = numerosPurepecha + arregloNumeros[unidades - 1];
        }
    //*    JOptionPane.showMessageDialog(null, numerosPurepecha);
    return numerosPurepecha;
}
}
