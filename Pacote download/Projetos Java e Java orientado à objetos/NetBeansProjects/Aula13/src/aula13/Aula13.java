/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Adolfo
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir("Comida");
        c.reagir(true);
        c.reagir(4, 20);
        c.reagir(16, 4);
    }
    
}
