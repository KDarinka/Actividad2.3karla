/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2.pkg3karla;
import java.util.Scanner;
/**
 *
 * @author carri
 */
public class Actividad23karla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miConsola = new Scanner(System.in);
        System.out.println("insertar un mes del 1 al 12, para saber en el trimestre en el que se encuentra:");
       int numero = miConsola.nextInt();
       
       if (numero <=3){
           System.out.println("esta en el primer trimestre del año");}
        if (numero >=4 && numero <= 6){
            System.out.println("esta en el segundo trimestre del año");}
        if (numero >=7 && numero <=9){
            System.out.println("esta en el tercer trimestre del año");}
        else if (numero >=10 && numero <=12){
             System.out.println("esta en el cuarto trimestre del año");}    
                    }
        
    }
    
}
