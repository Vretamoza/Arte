/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arteelectronico;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author TheLokestraps
 */
public class Test {
    public static void main(String[] args) {
        String Opt[] = {"??????","???????","???????"};
        int Vec[]= new int [100];
        int Rel[]= new int [100];
        int Op[] = new int [100];
        Random r1 = new Random();
        Rel[1]=3;
        Rel[2]=4;
        Rel[3]=2;
        Rel[4]=5;
        for (int i=1;i<=3;i++){
            int Aux=(r1.nextInt(3)+1);
            if(!comprobarNumero(Aux,Op)){
                Op[i]=Aux;
            }else{
                i--;
            }
            
        }
        for(int i=1;i<=4;i++){
            JOptionPane.showMessageDialog(null,"Numero "+i+" es "+Rel[Op[i]]);
        }
    }
    public static boolean comprobarNumero(int num,int Al[]){
               for(int i=1;i<=3;i++){
                       if(Al[i]==num)
                            return true;
               }
               return false;
         }
}
