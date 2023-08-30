package modelos;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> items;

    public Compra() {
        this.items = new ArrayList<Item>();
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }

    public void quitarItem(Item item) {
        this.items.remove(item);
    }

    public int calcularTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrecio();
        }
        return sum;

    }

    public void pagar(IEstrategiaPago metodoPago) {
        int cantidad = calcularTotal();
        metodoPago.pagar(cantidad);

    }
}
