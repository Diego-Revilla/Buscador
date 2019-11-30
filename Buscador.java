import java.util.Vector; //Importacion de la clase vector
/**
 * 
 * La clase Buscador recopila las notas y las guarda en un vector
 * @author José Antonio Diego Revilla
 * @version 1.0
 */
public class Buscador //Se crea la clase Buscador
{
    private Vector <Nota> misNotas = new Vector<Nota>(); //Declaracion de un vector para guardar las notas
    
    
    /**
     * Contructor para crear un Buscador
     * @param Parametro elipse que recibe cualquier numero de notas
     */
    public Buscador(Nota... notas){
        for(Nota x: notas){ //Ciclo for para ir guardando el numero de notas que se le vayan pasando 
            misNotas.addElement(x);
        }
    }
    
    /**
     * Método para buscar coincidencias con un token en todas las notas guardadas
     * @param Parametro que recibe una palabra a buscar
     */
    public void buscarEnTodasLasNotas(String token){ //Se abre el método
        for(Nota x: misNotas){ //Ciclo for para recorrer nota por nota
         if(x.loContiene(token)){ //If que llama al metodo de la clase nota loContiene() 
             int veces = x.nCoincidencias(token); //Variable que almacena en numero de veces que se encontro una palabra
             System.out.println("La nota '" + x.getTitulo() + "' tiene " + veces + " coincidencias"); //Impresión de numero de veces encontrada la palabra
             x.buscarEnEstaNota(token); //Ejecuta este método para imprimir el contenido donde está la coincidencia
             
            } //Cierre del if
        } //Cierre del ciclo for
    } //Cierre del método
    
    
} //Termina la clase
