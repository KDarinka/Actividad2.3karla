/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2.pkg1karla;
import java.util.Scanner;
/**
 *
 * @author carri
 */
public class Actividad21karla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miConsola = new Scanner(System.in);
        //crear un método que determine i el dia es hábil(lunes a viernes)y emitir un mensaje o
        //en su caso emitir un mensaje que es fin de semana 
         System.out.println("introducir un dia de la semana ");
          String diaS = miConsola.nextLine();
          
          switch (diaS){
              case "LUNES":
                  System.out.println("Dia habil ");
                  break;
              case "MARTES":
                  System.out.println("Dia habil");
                  break;
              case "MIERCOLES":
                  System.out.println("Dia habil");
                  break;
              case "JUEVES":
                  System.out.println("Dia habil");
                  break;
              case "VIERNES":
                  System.out.println("Dia habil");
                  break;
              default:
                  System.out.println("Es fin de semana");
                  break;
              
          }
    }
    
}
