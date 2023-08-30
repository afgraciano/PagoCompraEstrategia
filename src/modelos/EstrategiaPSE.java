package modelos;

public class EstrategiaPSE implements IEstrategiaPago {

    private String email;
    private String password;
    private String entidadBancaria;

    public EstrategiaPSE(String email,
            String password,
            String entidadBancaria) {
        this.email = email;
        this.password = password;
        this.entidadBancaria = entidadBancaria;

    }

    @Override
    public void pagar(int cantidad) {
        System.out.println(cantidad + " pagada por PSE");
    }

}
