
public class Tarea
{
    private String descripcion;
    private Boolean terminada;
    private int prioridad;
    
    public Tarea(String nombre)
    {
        descripcion = nombre;
        terminada = false;
        prioridad = 0;
    }
    
    public String mostrarTarea()
    {
        return descripcion;
    }
    
    public boolean verTerminada()
    {
        return terminada;
    }
    
    public void marcarCompleta()
    {
        terminada = true;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        if (terminada)
        {
            textoADevolver += "HECHA ";
        }
        textoADevolver += descripcion;
        return textoADevolver;
    }
    
     /**
     * M�todo para establecer prioridad para una tarea del 0 al 5.
     */
    public void establecerPrioridad(int numeroPrioridad)
    {
        if (numeroPrioridad >= 0 && numeroPrioridad <=5){
            prioridad = numeroPrioridad;
        }
    }
}
