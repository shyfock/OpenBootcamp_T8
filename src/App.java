public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("Adolfo");
        persona.setTelefono("3335552222");

        var edadPersona = persona.getEdad();
        var nombrePersona = persona.getNombre();
        var telefonoPersona = persona.getTelefono();

        System.out.println("Edad: " + edadPersona);
        System.out.println("Nombre: " + nombrePersona);
        System.out.println("Telefono: " + telefonoPersona);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
