import java.time.LocalDate;
public class Tarea
{
    private String descripcion;
    private Boolean terminada;
    private int prioridad;
    private LocalDate nuevaFechaVencimiento;
    
    public Tarea(String nombre)
    {
        descripcion = nombre;
        terminada = false;
        prioridad = 0;
        nuevaFechaVencimiento = null;
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
        if (nuevaFechaVencimiento != null)
        {
            textoADevolver += descripcion + " (" + prioridad + ") " + "Fecha de vencimiento: [" + nuevaFechaVencimiento + "]";
        }
        else
        {
            textoADevolver += descripcion + " (" + prioridad + ") ";
        }
        
        return textoADevolver;
    }
    
    public void establecerPrioridad(int numeroPrioridad)
    {
        if (numeroPrioridad >= 0 && numeroPrioridad <=5){
            prioridad = numeroPrioridad;
        }
    }
    
    public void establecerFechaVencimiento(int anio, int mes, int dia)
    {
        LocalDate fechaVencimiento = LocalDate.of(anio,mes,dia);
        nuevaFechaVencimiento = fechaVencimiento;
    }
}
