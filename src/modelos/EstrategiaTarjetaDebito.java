package modelos;

public class EstrategiaTarjetaDebito implements IEstrategiaPago {

    private String nombre;
    private String numeroTarjeta;
    private String fechaExpiracion;

    public EstrategiaTarjetaDebito(String nombre,
            String numeroTarjeta,
            String entidadBancaria,
            String fechaExpiracion) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;

    }

    @Override
    public void pagar(int cantidad) {
        System.out.println(cantidad + " pagada por tarjeta de Debito");
    }

}
