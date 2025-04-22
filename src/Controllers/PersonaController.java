package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        System.out.println("Arreglo ordenado por edad");
        int j=0;
        int aux=0;

        
        for(int i = 1; i < personas.length; i++){
            j=i;
            aux=personas[i].getEdad();
            Persona personaGuardar=personas[i];
            while ((j>0)&&(personas[j-1].getEdad()>aux)) {


                personas[j] = personas[j-1];
                j--;


            }
            personas[j] = personaGuardar;


        }
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int bajo=0;
        int alto=personas.length-1;



        while(bajo<=alto){
            int central=bajo+(alto-bajo)/2;
            int central1=(bajo + alto)/2;

            for(int i=bajo; i<=alto; i++){
                System.out.print(personas[i].getEdad());
                if(i<alto){
                    System.out.print(" | ");
                }

            }
            System.out.println();



            if(personas[central].getEdad()==edad){
                System.out.println("              --> ENCONTRADO ");
                return personas[central];// aqui el return si se cumple la condicion termina el while ya no sigue a lo demas abajo
            }
            if(personas[central].getEdad()<edad){
                System.out.println("              --> DERECHA ");
                bajo=central+1;
            }else{
                System.out.println("              --> IZQUIERDA ");
                alto=central-1;
            }

        }
        return null;

    }

    public void showPersonByEdad(Persona[] personas, int edad) {
        Persona personaEncontrada = buscarPorEdad(personas, edad);
    
        if (personaEncontrada == null) {
            System.out.println(" No hay persona con la edad " + edad);
        } else {
            System.out.println(" La persona con la edad " + edad + " es " + personaEncontrada.getNombre());
        }
    }
}


