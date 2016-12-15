
public class Tarea
{
    private String descripcion;
    private Boolean terminada;
    
    public Tarea(String nombre)
    {
        descripcion = nombre;
        terminada = false;
    }
    
    public String mostrarTarea()
    {
        return descripcion;
    }
    
    public boolean verTerminada()
    {
        return terminada;
    }
}
