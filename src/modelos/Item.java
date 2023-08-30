package modelos;

public class Item {
   
    private String codigoReferencia;
    private int precio;

    public Item(String codigoReferecia, int precio) {//metodo constructor
        this.codigoReferencia = codigoReferecia;
        this.precio = precio;
    }

    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    public int getPrecio() {
        return precio;
    }

}
