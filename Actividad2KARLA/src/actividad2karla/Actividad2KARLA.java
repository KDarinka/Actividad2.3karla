/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2karla;
import java.util.Scanner;
/**
 *
 * @author carri
 */
public class Actividad2KARLA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear un horario de usted de cualquier dia de la semana, leer un valor de 1 al 24 validar 
        //e imprimir la accion que realiza en su horario.
        Scanner miConsola = new Scanner(System.in);
        System.out.println("introducir una hora del 1 al 24 para saber que se debe realizar");
       int hora = miConsola.nextInt();
        if(hora >= 1 && hora <= 24){
            if(hora == 6){
                 System.out.println("Despertar a las " + hora + " de la mañana");
            } else if(hora >= 7 && hora < 8){
                System.out.println("bajar y ayudar a mi mamá en nuestra carniceria desde las 7 de la mañana hasta las 8 de la mañana");
            } else if(hora >= 9 && hora < 10){
                System.out.println("Entrar a mi clase de Fisica desde las 9 de la mañana hasta las 10 de la mañana ");
            } else if(hora == 11){
                System.out.println("Desayunar a las " + hora + "de la mañana");
            } else if(hora == 12){
                System.out.println("Limpiar mi casa  " + hora + " de la tarde");
            } else if(hora >= 13 && hora < 14){
                System.out.println("bajar nuevamente a mi carniceria a cerrar desde la 1 de la tarde hasta las 2  de la tarde ");
            } else if(hora == 14){
                System.out.println("Comer a las 2 de la tarde");
            } else if(hora >= 16 && hora < 18 ){
                System.out.println("ir a entrenar crossfit desde las 4 de la tarde hasta las 6 de la tarde ");
            } else if(hora ==18){
                System.out.println("entrar a bañarme a las " + hora + "de la tarde");
            } else if(hora >= 19 && hora <21){
                System.out.println("entrar a clases de lenguaje de la programacion desde las 7 hasta las 9 de la noche");
            } else if(hora ==21){
                System.out.println("cenar a las " + hora + "de la noche ");
            }    else if (hora ==22){
                System.out.println("hacer las tareas pendientes a las " + hora + "de la noche ");
            } else if((hora >= 23 && hora <= 24) || (hora >= 1 && hora < 6)){
                System.out.println("Dormir desde las 11 de la noche, hasta las 6 de la mañana");
            }
        } else {
            System.out.println(" introducir una hora correcta, de 1 a 24 horas");
        }
            }
      
    }
    
}
