package Numeros;


import javax.swing.JOptionPane;

 class Principal {
     public static void main(String[] args) {
         int opcion=1;
        do {
             
        opcion= Integer.parseInt(JOptionPane.showInputDialog("Menu"
                + "\n 1. Numeros en Romanos"
                + "\n 2. Numeros en Inglés"
                + "\n 3. Números en P'urepecha"
                + "\n 4. Imprimir Números en Inglés"
                + "\n 5. Imprimir Números en P'urepecha"
                + "\n 8. Salir"
                + "\n  Elige una opción"));
                
        switch(opcion){
            case 1:
                Romanos nr = new Romanos ();
                JOptionPane.showMessageDialog(null, "El número 123 es:  " + nr.regresanumletra(123));
                break;
            case 2:
                break;
            case 3:
                NumPurepecha np  = new NumPurepecha ();
                JOptionPane.showMessageDialog(null, "El número 123 es:  " + np.regresanumeroaletra(123));
                break;
            case 4:
                
    /*            in.imprimir("romano");
                break;
            case 5:
                
                
                in.imprimir("P'UREPECHA");
                
    */            break;
            case 8: 
                
                JOptionPane.showMessageDialog(null, "Adios");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Elije una opción valida");
                break;
        }
        }while(opcion!=8);
     }
   
}
