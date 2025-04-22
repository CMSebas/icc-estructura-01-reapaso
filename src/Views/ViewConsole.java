package Views;

import Models.Persona;

public class ViewConsole {

    public void mostrarArreglo(Persona[] personas){
        for(int i=0;i<personas.length;i++){
            System.out.print(personas[i]);
            System.out.print("||");
        }
        System.out.println(" ");

    }
    
}
