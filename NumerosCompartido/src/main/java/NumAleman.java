
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecortes
 */
public class NumAleman {
    
   


   
    public String NumeroAleman(int num) 
    {
        //Creacion de Variables
        int  uni, dec, cen, unimi, decmi, cenmi;
        String nletra = "";
        //String entradaTeclado="";      
           

            //Operacion para sacar el numero entero Centenas de Millar
            cenmi = (int)num / 100000;
            num = num % 100000;
            //Operacion para sacar el numero entero Decenas de Millar
            decmi = (int) num /10000;
            num = num % 10000;
            //Operacion para sacar el numero entero unidades de Millar
            unimi = (int) num / 1000;
            num = num % 1000;
            //Operacion para sacar el numero entero Centenas
            cen = (int) num / 100;
            num = num % 100;
            //Operacion para sacar el numero entero decenas
            dec = (int) num / 10;
            num = num % 10;
            // Numero restante unidad
            uni = num;
            System.out.println("Cenmi "+cenmi+",decmi "+decmi+",unimi "+unimi+",Cen "+cen+",Dec "+dec+",uni "+uni);

////////////////////////////////////////////////////////////////////////////////
            

            if (unimi!=0) 
            {
                    //Aqui entra el valor decena de millar que es mayor o igual a 20
                switch (decmi) 
                {
                    case 2:
                        nletra += ("undzwanzigtausend");
                        break;
                    case 3:
                        nletra += ("unddreißigtausend");
                        break;
                    case 4:
                        nletra += ("undvierzigtausend");
                        break;
                    case 5:
                        nletra += ("undfünfzigtausend");
                        break;
                    case 6:
                        nletra += ("undsechzigtausend");
                        break;
                    case 7:
                        nletra += ("undsiebzigtausend");
                        break;
                    case 8:
                        nletra += ("undachtzigtausend");
                        break;
                    case 9:
                        nletra += ("undneunzigtausend");
                        break;
                }
                
            }
            else
            {
                    //Aqui entra el valor decena de millar que es mayor o igual a 20
                switch (decmi) 
                {
                    case 2:
                        nletra += ("zwanzig­tausend");
                        break;
                    case 3:
                        nletra += ("dreißig­tausend");
                        break;
                    case 4:
                        nletra += ("vierzig­tausend");
                        break;
                    case 5:
                        nletra += ("fünfzig­tausend");
                        break;
                    case 6:
                        nletra += ("sechzig­tausend");
                        break;
                    case 7:
                        nletra += ("siebzig­tausend");
                        break;
                    case 8:
                        nletra += ("achtzig­tausend");
                        break;
                    case 9:
                        nletra += ("neunzig­tausend");
                        break;
                }
                
            }

            //Se convierte a cadena el valor decena de millar y unidades de millar ejemplo 2 y 1
            String caddecmi = decmi+"";
            String cadunimi = unimi+"";
            //Se juntan las 2 variables en cadena para formar solo una cadena quedando 21 como cadena
            String NNMi = caddecmi+cadunimi;
            // Se convierte a entero nuevamente pero con los 2 valores unidos 21 pero como entero
            int NNMi2 =Integer.parseInt(NNMi);
                
            //System.out.println(nletra);
             //Se convierte a cadena el valor decena de millar y unidades de millar ejemplo 2 y 1
            String caddec = dec+"";
            String caduni = uni+"";
            //Se juntan las 2 variables en cadena para formar solo una cadena quedando 21 como cadena
            String NN = caddec+caduni;     
            // Se convierte a entero nuevamente pero con los 2 valores unidos 21 pero como entero
            int NN2 =Integer.parseInt(NN); 
            
           
            if (uni!=0) 
            {
                switch (dec) 
                {
                    case 2:
                        nletra = nletra+("undzwanzig");
                        break;
                    case 3:
                        nletra = nletra+("unddreißig");
                        break;
                    case 4:
                        nletra = nletra+("undvierzig");
                        break;
                    case 5:
                        nletra = nletra+("undfünfzig");
                        break;
                    case 6:
                        nletra = nletra+("undsechzig");
                        break;
                    case 7:
                        nletra = nletra+("undsiebzig");
                        break;
                    case 8:
                        nletra = nletra+("undachtzig");
                        break;
                    case 9:
                        nletra = nletra+("undneunzig");
                        break;
                }
            }else
            {
            //Aqui entra el valor decena que es mayor a 20 
                switch (dec) 
                {
                    case 2:
                        nletra = ("zwanzig")+nletra;
                        break;
                    case 3:
                        nletra = ("dreißig")+nletra;
                        break;
                    case 4:
                        nletra = ("vierzig")+nletra;
                        break;
                    case 5:
                        nletra = ("fünfzig")+nletra;
                        break;
                    case 6:
                        nletra = ("sechzig")+nletra;
                        break;
                    case 7:
                        nletra = ("siebzig")+nletra;
                        break;
                    case 8:
                        nletra = ("achtzig")+nletra;
                        break;
                    case 9:
                        nletra = ("neunzig")+nletra;
                        break;
                }
            }
            //System.out.println(nletra);
           //Si el valor se encuentra entre 10 y 19 entra al if  
            if (NN2 > 9 & NN2 < 20) 
            {
               //Aqui entra el valor decena que es mayor a igual a 9 y menor a 20 
               switch (NN2) 
                {

                    case 10:
                        nletra = ("zehn")+nletra;
                        break;
                    case 11:
                        nletra = ("elf")+nletra;
                        break;
                    case 12:
                        nletra = ("zwölf")+nletra;
                        break;
                    case 13:
                        nletra = ("dreizehn")+nletra;
                        break;
                    case 14:
                        nletra = ("vierzehn")+nletra;
                        break;
                    case 15:
                        nletra = ("fünfzehn")+nletra;
                        break;
                    case 16:
                        nletra = ("sechzehn")+nletra;
                        break;
                    case 17:
                        nletra = ("siebzehn")+nletra;
                        break;
                    case 18:
                        nletra = ("achtzehn")+nletra;
                        break;
                    case 19:
                        nletra = ("neunzehn")+nletra;
                        break;
                }
              
            }
            else
            {
                //Si el valor es menor a 10 es unidad de millar y entra al else
               switch (uni) 
                {
                    case 1:
                        nletra = ("eins")+nletra;
                        break;
                    case 2:
                        nletra = ("zwei")+nletra;
                        break;
                    case 3:
                        nletra = ("drei")+nletra;
                        break;
                    case 4:
                        nletra = ("vier")+nletra;
                        break;
                    case 5:
                        nletra = ("fünf")+nletra;
                        break;
                    case 6:
                        nletra = ("sechs")+nletra;
                        break;
                    case 7:
                        nletra = ("sieben")+nletra;
                        break;
                    case 8:
                        nletra = ("acht")+nletra;
                        break;
                    case 9:
                        nletra = ("neun")+nletra;
                        break;
                    
                } 
            }    
            //Aqui entra el valor centena 
            switch (cen) 
            {
                case 1:
                    nletra = ("einhundert")+nletra;
                    break;
                case 2:
                    nletra = ("zweihundert")+nletra;
                    break;
                case 3:
                    nletra = ("dreihundert")+nletra;
                    break;
                case 4:
                    nletra = ("vierhundert")+nletra;
                    break;
                case 5:
                    nletra = ("fünfhundert")+nletra;
                    break;
                case 6:
                    nletra = ("sechshundert")+nletra;
                    break;
                case 7:
                    nletra = ("siebenhundert")+nletra;
                    break;
                case 8:
                    nletra = ("achthundert")+nletra;
                    break;
                case 9:
                    nletra = ("neunhundert")+nletra;
                    break;
            }
            //Si el valor se encuentra entre 10 y 19 entra al if     
            if (NNMi2>9 & NNMi2<20) 
            {
                //Aqui entra el valor decena de millar que es mayor a igual a 9 y menor a 20
                switch (NNMi2) 
                {
                    case 10:
                        nletra = ("zehn­tausend")+nletra;
                        break;
                    case 11:
                        nletra = ("elf­tausend"+nletra);
                        break;
                    case 12:
                        nletra = ("zwölf­tausend")+nletra;
                        break;
                    case 13:
                        nletra = ("dreizehn­tausend")+nletra;
                        break;
                    case 14:
                        nletra = ("vierzehn­tausend")+nletra;
                        break;
                    case 15:
                        nletra = ("fünfzehn­tausend")+nletra;
                        break;
                    case 16:
                        nletra = ("sechzehn­tausend")+nletra;
                        break;
                    case 17:
                        nletra = ("siebzehn­tausend")+nletra;
                        break;
                    case 18:
                        nletra = ("achtzehn­tausend")+nletra;
                        break;
                    case 19:
                        nletra = ("neunzehn­tausend")+nletra;
                        break; 
                }
               
            }
            System.out.println(NNMi2);
            if (decmi!=0 && NNMi2>19 ) 
            {
                switch (unimi) 
                {
                    case 1:
                        nletra =  ("eins")+nletra;
                        break;
                    case 2:
                        nletra = ("zwei")+nletra;
                        break;
                    case 3:
                        nletra = ("drei")+nletra;
                        break;
                    case 4:
                        nletra = ("vier")+nletra;
                        break;
                    case 5:
                        nletra = ("fünf")+nletra;
                        break;
                    case 6:
                        nletra = ("sieben")+nletra;
                        break;
                    case 7:
                        nletra = ("sechs")+nletra;
                        break;
                    case 8:
                        nletra = ("acht")+nletra;
                        break;
                    case 9:
                        nletra = ("neun")+nletra;
                        break;            
                }
            }
            //Si el valor es menor a 10 es unidad de millar y entra al else
            else if(NNMi2>19||NNMi2<10)
            {
                switch (unimi) 
                {
                    case 1:
                        nletra =  ("ein­tausend")+nletra;
                        break;
                    case 2:
                        nletra = ("zwei­tausend")+nletra;
                        break;
                    case 3:
                        nletra = ("drei­tausend")+nletra;
                        break;
                    case 4:
                        nletra = ("vier­tausend")+nletra;
                        break;
                    case 5:
                        nletra = ("fünf­tausend")+nletra;
                        break;
                    case 6:
                        nletra = ("sieben­tausend")+nletra;
                        break;
                    case 7:
                        nletra = ("sechs­tausend")+nletra;
                        break;
                    case 8:
                        nletra = ("acht­tausend")+nletra;
                        break;
                    case 9:
                        nletra = ("neun­tausend")+nletra;
                        break;            
                }
                
            }
            return nletra;
            
        
    }
}
