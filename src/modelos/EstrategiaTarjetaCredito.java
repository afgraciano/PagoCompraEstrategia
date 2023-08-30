package modelos;

public class EstrategiaTarjetaCredito implements IEstrategiaPago {

    private String nombre;
    private String numeroTarjeta;
    private String cvv;
    private String fechaExpiracion;

    public EstrategiaTarjetaCredito(String nombre,
            String numeroTarjeta,
            String entidadBancaria, String cvv,
            String fechaExpiracion) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;

    }

    @Override
    public void pagar(int cantidad) {
        System.out.println(cantidad + " pagada por tarjeta de Credito");
    }

}
