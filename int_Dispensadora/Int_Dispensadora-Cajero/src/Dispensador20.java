public class Dispensador20 extends DispensadorBase
{
    @Override
    public void dispensar(int cantidad)
    {
        if (cantidad >= 20000) {
            int num = cantidad / 20000;
            int resto = cantidad % 20000;
            System.out.println("Dispensando " + num + " billetes de 20.000");
            procesarSiguiente(resto);
        } else {
            procesarSiguiente(cantidad);
        }
    }
}
