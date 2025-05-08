public class Credencial implements Cloneable {
    private String nombre;
    private String cargo;
    private String rut;

    public Credencial(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("RUT: " + rut);
    }

    @Override
    public Credencial clone() {
        try {
            return (Credencial) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar la credencial", e);
        }
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public void setRut(String rut) { this.rut = rut;}
}