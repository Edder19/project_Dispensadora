abstract class DispensadorBase implements INTDispensador
{
    protected INTDispensador siguiente;
    @Override
    public void setSiguiente(INTDispensador siguiente) {
        this.siguiente = siguiente;
    }
    protected void procesarSiguiente(int cantidad) {
        if (siguiente != null) {
            siguiente.dispensar(cantidad);
        } else if (cantidad > 0) {
            System.out.println("Error: No se puede dispensar " + cantidad);
        }
    }
}
