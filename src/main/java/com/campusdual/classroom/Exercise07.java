package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        int num=10;

        positionInAList(num);
        sumFirstNaturalNumbers(num);
        showFirstNaturalNumbers(num);

    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer>list = new ArrayList<>();
        boolean isIn = false;
        int index = 0;
        for (int i=0;  i<11; i++){
            list.add(i);
        }
        for (int i=0; i<11; i++){
            if(list.get(i)==num){
                isIn = true;
                index = i;
                break;
            }
            else
                isIn = false;
        }
        System.out.println(list.get(index));
        System.out.println(isIn);
        if(isIn){
            System.out.println(num+" se encuentra en la posición: "+list.indexOf(index));
        }else
            System.out.println(num+" no se encuentra en la lista.");

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum=0, nnum=1;
        for (int i=0; i<num; i++){
            sum=sum+nnum;
            nnum=nnum+1;
        }

        System.out.println(sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i=0; i<=num; i++){
            System.out.println(i+1);
        }
    }

}
