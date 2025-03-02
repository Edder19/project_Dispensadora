class Dispensador5 extends DispensadorBase
{
    @Override
    public void dispensar(int cantidad)
    {
        if (cantidad >= 5000) {
            int num = cantidad / 5000;
            int resto = cantidad % 5000;
            System.out.println("Dispensando " + num + " billetes de 5.000");
            procesarSiguiente(resto);
        } else {
            procesarSiguiente(cantidad);
        }
    }
}