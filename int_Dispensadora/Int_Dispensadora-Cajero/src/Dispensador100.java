class Dispensador100 extends DispensadorBase
{
    @Override
    public void dispensar(int cantidad) {
        if (cantidad >= 100000)
        {
            int num = cantidad / 100000;
            int resto = cantidad % 100000;
            System.out.println("Dispensando " + num + " billetes de 100.000");
            procesarSiguiente(resto);
        } else {
            procesarSiguiente(cantidad);
        }
    }
}


