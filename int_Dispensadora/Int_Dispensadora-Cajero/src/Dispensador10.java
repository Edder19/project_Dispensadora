class Dispensador10 extends DispensadorBase
{
    @Override
    public void dispensar(int cantidad)
    {
        if (cantidad >= 10000) {
            int num = cantidad / 10000;
            int resto = cantidad % 10000;
            System.out.println("Dispensando " + num + " billetes de 10.000");
            procesarSiguiente(resto);
        } else {
            procesarSiguiente(cantidad);
        }
    }
}
