import java.util.Random;

public class MontyHallPrueba {

    public static void main(String[] args) {
        Random random = new Random();

        int numSimulaciones = 20000;
        int cambiarDePuerta = 0;
        int mantenerMisma = 0;

        for (int i = 0; i < numSimulaciones; i++) {

            /*
            0: Representa la primera puerta
            1: Representa la segunda puerta
            2: Representa la tercera puerta
             */
            int premioTrasPuerta = random.nextInt(3);

            // Ahora el participante escoge una de las puertas
            int eleccionDelParticipante = random.nextInt(3);

            // A continuación, Monty procede a abrir una puerta
            int montyAbrePuerta = 0;
            while (montyAbrePuerta == premioTrasPuerta || montyAbrePuerta == eleccionDelParticipante) {
                montyAbrePuerta++;
            }

            // El participante piensa si quiere cambiar de puerta
            int nuevaEleccion = 0;
            while (nuevaEleccion == eleccionDelParticipante || nuevaEleccion == montyAbrePuerta) {
                nuevaEleccion++;
            }

            // Sumas totales de cada caso
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