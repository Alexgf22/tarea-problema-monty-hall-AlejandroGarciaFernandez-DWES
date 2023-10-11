import java.util.*;

public class MontyHallPrueba {

    public static void main(String[] args) {
        Random random = new Random();

        int numSimulaciones = 20000;
        int cambiarDePuerta = 0;
        int mantenerMisma = 0;

        for (int i = 0; i < numSimulaciones; i++) {
            int premioTrasPuerta = random.nextInt(3);

            // Elección del participante
            int eleccionDelParticipante = random.nextInt(3);

            // Monty abre una puerta
            Set<Integer> puertasAbiertas = new HashSet<>();
            puertasAbiertas.add(premioTrasPuerta);
            puertasAbiertas.add(eleccionDelParticipante);

            int montyAbrePuerta;
            do {
                montyAbrePuerta = random.nextInt(3);
            } while (puertasAbiertas.contains(montyAbrePuerta));

            // El participante decide si quiere cambiar o no de puerta
            int nuevaEleccion = 3 - eleccionDelParticipante - montyAbrePuerta;

            // Actualizar el recuento
            if (nuevaEleccion == premioTrasPuerta) {
                cambiarDePuerta++;
            } else {
                mantenerMisma++;
            }
        }

        System.out.println("Estos son los resultados tras " + numSimulaciones + " simulaciones:");
        System.out.println("El participante ha ganado al cambiar de puerta: " + cambiarDePuerta + " veces.");
        System.out.println("El participante ha ganado al mantener la elección inicial: " + mantenerMisma + " veces.");
    }
}
