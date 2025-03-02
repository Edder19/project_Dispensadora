import javax.swing.JOptionPane;

public class CajeroAutomatico {
    public static void main(String[] args) {
        ATMDispensador cajero = new ATMDispensador();
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese el monto a retirar: "));
        cajero.retirar(cantidad);
    }
}

