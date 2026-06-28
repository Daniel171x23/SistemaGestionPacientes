public class Paciente {

    // Atributos
    private String nombre;
    private int edad;
    private String numeroExpediente;
    private String enfermedad;
    private String telefono;

    // Constructor
    public Paciente(String nombre, int edad, String numeroExpediente,
                    String enfermedad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroExpediente = numeroExpediente;
        this.enfermedad = enfermedad;
        this.telefono = telefono;
    }

    // Método para mostrar la información del paciente
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
        System.out.println("Enfermedad: " + enfermedad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("----------------------------");
    }

    // Método para actualizar la enfermedad
    public void actualizarEnfermedad(String nuevaEnfermedad) {
        enfermedad = nuevaEnfermedad;
    }
}
