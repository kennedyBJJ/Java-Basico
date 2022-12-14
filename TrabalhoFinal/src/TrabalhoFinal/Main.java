package TrabalhoFinal;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args){
        try {
            Cliente venilton = new Cliente("Venilton", "08016655319");
            
            Conta cc = new ContaCorrente(venilton);
            Conta poupanca = new ContaPoupanca(venilton);
            
            cc.depositar(10);
            cc.sacar(9.9 );
            
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
