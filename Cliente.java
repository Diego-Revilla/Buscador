/**
 * Clase cliente para probar las clase Nota y Buscador
 */
public class Cliente
{
    public static void main(String[] args){
     
        Nota nota1 = new Nota("Recordatorio","El cumpleaños de mi crush es mañana","16/10/19");
        Nota nota2 = new Nota("Pasado mañana","Dentro de dos dias tengo que ir a ver a mis tios","15/09/19");
        Nota nota3 = new Nota("Llaves","En la mañana dejé las llaves detras de la puerta, igual que ayer por la mañana","14/12/19");
        
        Buscador buscador1 = new Buscador(nota1, nota2, nota3);
        
        buscador1.buscarEnTodasLasNotas("mañana");
    }

}
