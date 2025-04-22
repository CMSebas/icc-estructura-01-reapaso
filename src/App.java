
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        ViewConsole console=new ViewConsole();
        PersonaController personaControl=new PersonaController();
        Persona[] personas = new Persona[] {
            new Persona("juan", 25),
            new Persona("Maria", 12),
            new Persona("Carlos", 35),
            new Persona("Ana", 12),
            new Persona("Luis", 11),
            new Persona("Sofia", 3),
            new Persona("Miguel", 7),
            new Persona("Laura", 18),
            new Persona("Pedro", 21),
            new Persona("Elena", 45)


        };

        console.mostrarArreglo(personas);
        personaControl.ordenarPorEdad(personas);
        console.mostrarArreglo(personas);
        personaControl.showPersonByEdad(personas, 18);
        personaControl.showPersonByEdad(personas, 99);




        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD 1 imprimir el arerglo 2.ordenar.3 imprimir el arreglo ordenado 4.buscar edad 40 5 impimir resultado 6.buscar edad 99 7 imprimir resultado

    }
}
