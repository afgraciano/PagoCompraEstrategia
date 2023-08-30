/*patron Strategy */

import modelos.*;

public class App {
    public static void main(String[] args) throws Exception {

        Compra compra = new Compra();

        Item item1 = new Item("1234", 10000);
        Item item2 = new Item("5678", 40000);

        compra.agregarItem(item1);
        compra.agregarItem(item2);

        // compra.pagar(new EstrategiaPSE("felipe.graciano@udea.edu.co", "13456",
        // "Bancolombia"));
        compra.pagar(new EstrategiaTarjetaCredito("Andres Felipe Graciano", "1234567890123456", "Bancolombia", "123",
                "28 Agosto 2023"));

    }
}
