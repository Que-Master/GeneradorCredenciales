import java.util.ArrayList;
import java.util.List;

public class GestorCredenciales {
    private static GestorCredenciales instancia;
    private List<Credencial> credenciales;

    private GestorCredenciales() {
        credenciales = new ArrayList<>();
    }

    public static GestorCredenciales getInstancia() {
        if (instancia == null) {
            instancia = new GestorCredenciales();
        }
        return instancia;
    }

    public void agregarCredencial(Credencial c) {
        credenciales.add(c);
    }

    public void mostrarCredenciales() {
        for (int i = 0; i < credenciales.size(); i++) {
            System.out.println("Credencial #" + (i + 1));
            credenciales.get(i).mostrar();
            System.out.println("---------------------");
        }
    }
}