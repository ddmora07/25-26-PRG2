package entregas.moraDaniel;

import java.util.Scanner;

public class MiPropioEdlin {
    static final int MAX_LINEAS = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineas = crearArrayLineas();
        String[] copiaAnterior = crearArrayLineas();

    }

    static String[] crearArrayLineas() {
        String[] array = new String[MAX_LINEAS];

        array[0] = "Bienvenidos al editor EDLIN";
        array[1] = "Utilice el menu inferior para editar el texto";
        array[2] = "------";
        array[3] = "[L] permite definir la linea activa";
        array[4] = "[E] permite editar la linea activa";
        array[5] = "[I] permite intercambiar dos lineas";
        array[6] = "[B] borra el contenido de la linea activa";
        array[7] = "[D] deshace la última acción realizada";
        array[8] = "[S] sale del programa";
        array[9] = "";

        return array;
    }
}
