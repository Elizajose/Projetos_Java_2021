/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplovariaveis;
import java.util.*;
/**
 *
 * @author eliza
 */
public class ExemploVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner notas = new Scanner(System.in);
        int x,y,media;
       

// recebe as notas e guarda na variavel
System.out.println("Informe a Primeira nota: ");
x=notas.nextInt();

System.out.println("Informe a Segunda nota: ");
y=notas.nextInt();


media=(x+y)/2;

if(media>=7)
    System.out.println("Você foi aprovado!");
else
    System.out.println("Você se fudeu!!");

        
    }
    
}
