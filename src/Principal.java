public class Principal {

    public static void main(String[] args) {

        // 1. Crear un objeto de tipo Persona (Clase base)
        System.out.println("--- Datos de la Persona Base ---");
        Persona persona1 = new Persona("Carlos Ruiz", 40, "8123456789");
        persona1.mostrarInformacion();

        // 2. Crear objetos de tipo Paciente (Clase hija)
        // OJO: El orden ahora es (nombre, edad, telefono, expediente, enfermedad)
        Paciente paciente1 = new Paciente(
                "Juan Pérez",
                35,
                "8112345678", // Teléfono (ahora va antes que el expediente)
                "EXP001",
                "Gripe"
        );

        Paciente paciente2 = new Paciente(
                "María López",
                28,
                "8187654321",
                "EXP002",
                "Migraña"
        );

        // Mostrar información de los pacientes
        paciente1.mostrarInformacion();
        paciente2.mostrarInformacion();

        // Actualizar enfermedad del primer paciente
        paciente1.actualizarEnfermedad("Bronquitis");

        System.out.println("Después de la actualización:");
        paciente1.mostrarInformacion();
    }
}
