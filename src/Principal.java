public class Principal {

    public static void main(String[] args) {

        // Crear objetos de tipo Paciente
        Paciente paciente1 = new Paciente(
                "Juan Pérez",
                35,
                "EXP001",
                "Gripe",
                "8112345678"
        );

        Paciente paciente2 = new Paciente(
                "María López",
                28,
                "EXP002",
                "Migraña",
                "8187654321"
        );

        // Mostrar información
        paciente1.mostrarInformacion();
        paciente2.mostrarInformacion();

        // Actualizar enfermedad del primer paciente
        paciente1.actualizarEnfermedad("Bronquitis");

        System.out.println("Después de la actualización:");

        paciente1.mostrarInformacion();
    }
}