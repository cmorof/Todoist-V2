import java.util.ArrayList;
import java.time.LocalDate;
public class ListaTareas
{
    private ArrayList <Tarea> listaDeTareas;
    private int proximoID;
    
    public ListaTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();
        proximoID = 10;
    }
    
    /**
     * M√©todo que permite a√±adir una nueva tarea.
     */
    
    public void addTarea (String descripcion)
    {
        Tarea nuevaTarea = new Tarea(descripcion, proximoID);
        
        listaDeTareas.add(nuevaTarea);
    }
    
    /**
     * M√©todo que muestra todas las tareas existentes numeradas.
     */
    
    public void mostrarTareas()
    {
        int indice = 0;
        while (indice < listaDeTareas.size())
        {
            System.out.println((indice + 1) + ". " + listaDeTareas.get(indice).toString());
            indice = indice + 1;
        }
    }
    
    /**
     * M√©todo que marca una tarea como completada.
     * M√©todo a prueba de errores.
     * numeroTarea es el n√∫mero de la tarea empezando en 1.
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
     * como par√°metro. -1 en caso contrario. NO MUESTRA NADA POR PANTALLA.
     */
    
    public void mostrarTareasCoincidentes(String textoABuscar)
    {
        int indice = 1;
        while (indice > 0 && indice <= listaDeTareas.size())
        {
            if (listaDeTareas.get(indice - 1).mostrarTarea().contains(textoABuscar))
            {
                System.out.println(indice + ". " + listaDeTareas.get(indice-1).toString() + listaDeTareas.get(indice - 1).mostrarTarea());
            }
            indice = indice +1;
        }
    }
    
    /**
     * MÈtodo que permite eliminar la tarea que ocupa la posiciÛn indicada.
     */
    
    public void eliminarTarea(int posicionTarea)
    {
        int posicionReal = posicionTarea - 1;
        if(posicionReal >= 0 && posicionReal < listaDeTareas.size())
        {
            listaDeTareas.remove(posicionReal);
        }
    }
    
     /**
     * MÈtodo para establecer prioridad para una tarea del 0 al 5.
     */
    
    public void establecerNuevaPrioridad(int posicion, int prioridad)
    {
        int posicionReal = posicion - 1;
        if (posicionReal >= 0 && posicionReal <= listaDeTareas.size())
        {
            if (prioridad >= 0 && prioridad <= 5)
            {
                listaDeTareas.get(posicionReal).establecerPrioridad(prioridad);
            }
        }
    }
    
    /**
     * MÈtodo para establecer una fecha de vencimiento para cada tarea.
     */
    
    public void establecerNuevaFechaVencimiento(int posicion, int anio, int mes, int dia)
    {
        int posicionReal = posicion - 1;
        if (posicionReal >= 0 && posicionReal <= listaDeTareas.size())
        {
            listaDeTareas.get(posicionReal).establecerFechaVencimiento(anio, mes, dia);
        }
    }
    
    public void mostrarHoy()
    {
        int indice = 0;
        LocalDate hoy = LocalDate.now();
        while (indice < listaDeTareas.size())
        {
            if(listaDeTareas.get(indice).devolverFecha() != null){
                if(listaDeTareas.get(indice).devolverFecha().isEqual(hoy))
                {
                    System.out.println((indice + 1) + ". " + listaDeTareas.get(indice).toString());
                }
            }
            indice = indice + 1;
        }
    }
    
    public void mostrarVencidas()
    {
        int indice = 0;
        LocalDate hoy = LocalDate.now();
        for (Tarea tarea : listaDeTareas)
        {
            if(listaDeTareas.get(indice).devolverFecha() != null){
                if(listaDeTareas.get(indice).devolverFecha().isBefore(hoy))
                {
                    System.out.println((indice + 1) + ". " + listaDeTareas.get(indice).toString());
                }
            }
            indice++;
        }
    }
    
    public void verTareaMasPrioritaria()
    {
        int prioridadMasAlta = 0;
        for (Tarea tarea : listaDeTareas)
        {
            if(prioridadMasAlta < tarea.obtenerPrioridad())
            {
                prioridadMasAlta = tarea.obtenerPrioridad();
            }
        }
        int indice = 0;
        while(indice < listaDeTareas.size())
        {
            Tarea tareaActual = listaDeTareas.get(indice);
            if(tareaActual.obtenerPrioridad() == prioridadMasAlta)
            {
                System.out.println((indice + 1) + ". " + tareaActual.toString());
            }
            indice++;
        }
    }
    
    public void verTareaMasPrioritaria2()
    {
        if (listaDeTareas.size() > 0)
        {
            Tarea tareaMasPrioritaria = listaDeTareas.get(0);
            for(Tarea tareaActual : listaDeTareas)
            {
                if (tareaActual.obtenerPrioridad() >= tareaMasPrioritaria.obtenerPrioridad())
                {
                    tareaMasPrioritaria = tareaActual;
                }
            }
            System.out.println(tareaMasPrioritaria);
        }
    }
}
