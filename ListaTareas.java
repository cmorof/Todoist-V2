
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
    
    /**
     * Método que marca una tarea como completada.
     * Método a prueba de errores.
     * numeroTarea es el número de la tarea empezando en 1.
     */
    
    public void marcarComoCompletada(int numeroTarea)
    {
        if (numeroTarea > 0 && numeroTarea <= listaDeTareas.size())
        {
            listaDeTareas.get(numeroTarea - 1).marcarCompleta();
        }
    }
    
    /**
     * Devuelve true o false si hay al menos una tarea que contiene el texto indicado
     * como parámetro. -1 en caso contrario. NO MUESTRA NADA POR PANTALLA.
     */
    
    public void mostrarTareasCoincidentes(String textoABuscar)
    {
        int indice = 1;
        while (indice > 0 && indice <= listaDeTareas.size())
        {
            if (listaDeTareas.get(indice - 1).mostrarTarea().contains(textoABuscar))
            {
                String textoAMostrar = "";
                if (listaDeTareas.get(indice - 1).verTerminada())
                {
                    textoAMostrar = "HECHO. ";
                }
                System.out.println(indice + ". " + textoAMostrar +listaDeTareas.get(indice - 1).mostrarTarea());
            }
            indice = indice +1;
        }
    }
}
