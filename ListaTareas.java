
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
}
