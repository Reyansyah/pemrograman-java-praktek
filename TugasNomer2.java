/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.nomer2;

import javax.swing.JOptionPane;

/**
 *
 * @author Hewlett-Packard
 */
public class TugasNomer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama ="";
        int nomer1=0;
        int nomer2=0;
        int nomer3=0;
        
        try {
        nama =JOptionPane.showInputDialog("masukan nama anda");
        nomer1 =Integer.parseInt(JOptionPane.showInputDialog(nomer1));
        nomer2 =Integer.parseInt(JOptionPane.showInputDialog(nomer1));
        nomer3 =Integer.parseInt(JOptionPane.showInputDialog(nomer1));
        String msg = "nama kamu "+nama+" "+" "+nomer1+" "+nomer2+"dan "+nomer3;
        JOptionPane.showMessageDialog(null, msg);
        
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null, "ngebleng");
        }
    }
    
}
