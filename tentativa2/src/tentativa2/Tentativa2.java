/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tentativa2;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author DELL
 */
public class Tentativa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       MainFrame main = new MainFrame();
       main.setVisible(true);
               
     
        
    }
    public static void error(){
    JOptionPane.showMessageDialog(null, "Opção Invalida");
    }
    public static int retorna(int x, int y){
        zona zona = new zona();
        zona.frete = 0.00;
        produto celular = new produto();
        celular.nome = "Cellphone nokia-2000";
        celular.valor = 500.00;
       
        produto ssd = new produto();
        ssd.nome = "SSD 200TB";
        ssd.valor = 700.00;
       
        produto pc = new produto();
        pc.nome = "PC Gamer Atual";
        pc.valor = 15.00;
       
       if(y == 1){
       zona.frete = 25.00;
       }
       else if(y == 2){
         zona.frete = 20.00;

       }
       else if(y == 3){
         zona.frete = 15.50;

       }
       else if(y == 4){
         zona.frete = 15.50;

       }
    if(x == 1){
    JOptionPane.showMessageDialog(null,"Modelo: " + celular.nome + " Valor e frete em R$: " + celular.valor + " e " + celular.frete + " "+ "Totalizando: " + (celular.valor + zona.frete));
    }
    else if(x == 2){
        JOptionPane.showMessageDialog(null,"Modelo: " + ssd.nome + " Valor e frete em R$: " + ssd.valor + " e " + ssd.frete + " "+ "Totalizando: " + (ssd.valor + zona.frete));
    }
    else if(x == 3){
        JOptionPane.showMessageDialog(null,"Modelo: " + pc.nome + " Valor e frete em R$: " + pc.valor + " e " + pc.frete + " "+ "Totalizando: " + (pc.valor + zona.frete));
    }
    
    return x;
    }
    
}
