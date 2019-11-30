/**
 * 
 * La clase Nota crea una Nota donde guardar escritos y los relaciona con diferentes métodos
 * @author José Antonio Diego Revilla
 * @version 1.0
 */
//Creación de la clase Nota
public class Nota
{
    // Declaración de atributps
    private String titulo; //Declaración de un título para la nota
    private String contenido; //Declaración de un String para guardar el cuerpo de la nota
    private String fecha; //Declaración de un String para la fecha
    
    /**
     * Constructor para crear la nota
     * @param Recibe como parámetro 3 Strings: un título, el contenido y una fecha
     */
    public Nota(String titulo, String contenido, String fecha){
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
    }
    
    /**
     * Método para hacer una busqueda de una palabra en espeífico
     * @param  Un String token para hacer la búsqueda
     */
    public void buscarEnEstaNota(String palabra){
        //If para comprobar si el título o el contenido tiene la palabra buscada
        if(titulo.toUpperCase().contains(palabra.toUpperCase()) || contenido.toUpperCase().contains(palabra.toUpperCase())){
         //Impresión Del contenido de la nota pero con la palabra buscada resaltada el mayusculas
         System.out.println(titulo.replaceAll(palabra, palabra.toUpperCase())); 
         System.out.println(contenido.replaceAll(palabra,palabra.toUpperCase()) + "\n");
        }
        else System.out.printf("No hay coincidencias"); //Si no hay coincidencias, imprime 
    }
    
    /**
     * Método solo para saber si la nota contiene o no una palabra buscada
     * @param Un String con la palabra a buscar
     * @return Retorna true o false
     */
    public boolean loContiene(String palabra){
        //If para comprobar si la nota contiene la palabra buscada
        if(titulo.toUpperCase().contains(palabra.toUpperCase()) || contenido.toUpperCase().contains(palabra.toUpperCase())){
            return true;
        }
        else return false;
    }
    
    /**
     * Método que cuenta el numero de veces que la nota contiene una palabra buscada
     * @param Recibe como parametro la palabra a buscar
     * @return Retorna un entero con la cantidad de evces que se encontro la palabra
     */
    public int nCoincidencias(String palabra){
        //Declaración de algunas variables
        String cadena = titulo + " " + contenido; //Variable que concatena el contenido del titulo con el contenido
        int contador = 0; //Variable que almacenará el numero de coincidencias
        int index = 0; //Index para ir cortando la longitud de la cadena a buscar
     while(!cadena.isEmpty()){ //While que entra mientras la cedena tenga algo
         if(cadena.indexOf(palabra) > 0){ //If que deja entrar si hay una coincidencia con la palabra
             contador++; //Aumenta el contador
             cadena = cadena.substring(cadena.indexOf(palabra) + palabra.length()); //Recorta la cadena a partir de la palabra encontrada
             
             if(cadena.indexOf(palabra) < 0) break;//Si la cdena no contiene concidencias, se rompe el ciclo
            }
        }
        return contador;
    }
    
    /**
     * Metodo para poner un titulo a la nota
     * @param String con un titulo para la nota
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    /**
     * Método para poner contenido a la nota
     * @param String con el cuerpo de la nota
     */
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    
    /**
     * Método que retorna el título de una nota existente
     * @return Retorna un string con el título
     */
    public String getTitulo(){
        return titulo;
    }
    
    /**
     * Método para obtener el contenido de una nota existente
     * @return Retorna el cuerpo de la nota
     */
    public String getContenido(){
        return contenido;
    }
    
    /**
     * Método para escribir el titulo y cuerpo de la nota juntos
     * @return Retorna un String único con el título y el cuerpo
     */
    public String toString(){
        return titulo + "\n" + contenido;
    }
    
}
