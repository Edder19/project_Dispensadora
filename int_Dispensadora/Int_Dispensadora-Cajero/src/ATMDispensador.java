class ATMDispensador
{
    private INTDispensador inicioCadena;

    public ATMDispensador() {
        
        INTDispensador d100 = new Dispensador100();
        INTDispensador d50 = new Dispensador50();
        INTDispensador d20 = new Dispensador20();
        INTDispensador d10 = new Dispensador10();
        INTDispensador d5 = new Dispensador5();
        
        d100.setSiguiente(d50);
        d50.setSiguiente(d20);
        d20.setSiguiente(d10);
        d10.setSiguiente(d5);
        this.inicioCadena = d100;
    }
    public void retirar(int cantidad) {
        if (cantidad % 5000 != 0) {
            System.out.println("Error: La cantidad debe ser múltiplo de 5.000.");
            return;
        }
        System.out.println("Procesando retiro de: $" + cantidad);
        inicioCadena.dispensar(cantidad);
    }
    public class  CajeroAutomatico {
    public  CajeroAutomatico() {
    }
    }
}
