class Dispensador50 extends DispensadorBase
{
    @Override
    public void dispensar(int cantidad)
    {
        if (cantidad >= 50000) {
            int num = cantidad / 50000;
            int resto = cantidad % 50000;
            System.out.println("Dispensando " + num + " billetes de 50.000");
            procesarSiguiente(resto);
        } else {
            procesarSiguiente(cantidad);
        }
    }
}
