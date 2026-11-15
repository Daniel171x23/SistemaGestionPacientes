public class Paciente extends Persona {

    // Atributos propios del Paciente
    private String numeroExpediente;
    private String enfermedad;

    // Constructor
    public Paciente(String nombre, int edad, String telefono, String numeroExpediente,
                    String enfermedad) {
        // Llamamos al constructor de la clase padre (Persona)
        super(nombre, edad, telefono);
        this.numeroExpediente = numeroExpediente;
        this.enfermedad = enfermedad;
    }

    // Método para mostrar la información del paciente
    @Override
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
