/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import br.com.fic.view.Menu;

/**
 *
 * @author i3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}
