package es.usoarrays;

import java.util.Arrays;

public class UsoArrays extends operacionesArrays {
    
    //COMENTARIO
    //para la refactorización del codigo creamos diferentes metodo seleccionando el codigo concreto y 
    //mediante refactor>introduce>method, asegurandonos de que estos son publicos

    public static void main(String[] args) {

        int[] control = new int[NUM_ALUMNOS];
        int[] practicas = new int[NUM_ALUMNOS];
        float[] calificaciones = new float[NUM_ALUMNOS];
        int maxNota = 0;
        int minNota = 0;
        int countAprobados = 0;
        int countSuspensos = 0;
        float[] estadistica = new float[10];

        generarNotas(control);

        minNota = buscarMenor(control, minNota);

        maxNota = buscarMayor(control, maxNota);
        //Método buscarMayor
        //creamos el array de notas "practicas"
        generarNotas(practicas);

        generarCalificaciones(control, calificaciones, practicas);

        generarEstadisticas(control, calificaciones, estadistica);

        //Método generarAprobadosSuspensos
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            if (calificaciones[i] < 5) {
                countAprobados += 1;
            } else {
                countSuspensos += 1;
            }
        }
        //Método generarAprobadosSuspensos
        mostrarResultados(minNota, maxNota, control, practicas, calificaciones, countAprobados, countSuspensos);
    }
    
    
    public static final int NUM_ALUMNOS = 40; //REFACTORIZACION REALIZADA SELECCIONANDO EL NUMERO REFACTOR>INTRODUCE>CONSTANT, ASEGURANDONOS MARCAR QUE SE SUSTITUYAN TODAS LAS OCURRENCIAS
}




