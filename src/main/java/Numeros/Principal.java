package Numeros;

import javax.swing.JOptionPane;

class Principal {

    public static void main(String[] args) {
        int opcion = 1;
        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu"
                    + "\n 1. Numeros en Romanos"
                    + "\n 2. Numeros en Inglés"
                    + "\n 3. Números en P'urepecha"
                    + "\n 4. Números en Alemán"
                    + "\n 5. Números en Francés"
                    + "\n 6. Imprimir los Números en Romano"
                    + "\n 8. Salir"
                    + "\n  Elige una opción"));

            switch (opcion) {
                case 1:
                    Romanos nr = new Romanos();
                    JOptionPane.showMessageDialog(null, "El número 123 es:  " + nr.regresanumletra(123));
                    break;
                case 2:
                    NumerosIngles ni = new NumerosIngles();
                    JOptionPane.showMessageDialog(null, "El número 612612 es:  " + ni.ImrimirNumerosIngles(612612));
                    break;
                case 3:
                    NumPurepecha np = new NumPurepecha();
                    JOptionPane.showMessageDialog(null, "El número 123 es:  " + np.regresanumeroaletra(123));
                    break;
                case 4:
                    NumAleman na = new NumAleman();
                    JOptionPane.showMessageDialog(null, "El número 123 es:  " + na.NumeroAleman(123));

                    /*            in.imprimir("romano");
                break;
            case 5:
                
                
                in.imprimir("P'UREPECHA");
                
                     */ break;
                case 5:
                    //NumPurepecha np = new NumPurepecha();
                    //JOptionPane.showMessageDialog(null, "El número 123 es:  " + np.regresanumeroaletra(123));
                    break;
                case 6:
                    Romanos romanos = new Romanos();
                    String salida="";
                    for (int i = 1; i <= 100; i++) {
                        salida+= i+"-->"+romanos.regresanumletra(i)+"   ";
                        if (i % 10==0){
                            salida +="\n";
                        }                     
                    }
                    JOptionPane.showMessageDialog(null, "Los números del 1 al 20 son:  \n" + salida);
                    break;
                case 8:

                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Elije una opción valida");
                    break;
            }
        } while (opcion != 8);
    }

}
