
import java.util.ArrayList;
public class ListaTareas
{
    private ArrayList <Tarea> listaDeTareas;
    
    public ListaTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();
    }
    
    /**
     * Método que permite añadir una nueva tarea.
     */
    
    public void addTarea (String descripcion)
    {
        Tarea nuevaTarea = new Tarea(descripcion);
        listaDeTareas.add(nuevaTarea);
    }
    
    /**
     * Método que muestra todas las tareas existentes numeradas.
     */
    
    public void mostrarTareas()
    {
        int indice = 0;
        while (indice < listaDeTareas.size())
        {
            String textoAMostrar = "";
            if (listaDeTareas.get(indice).verTerminada())
            {
                textoAMostrar = "HECHO. ";
            }
            System.out.println((indice + 1) + ". " + textoAMostrar + listaDeTareas.get(indice).mostrarTarea());
            indice = indice + 1;
        }
    }
}
