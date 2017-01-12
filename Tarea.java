import java.time.LocalDate;
public class Tarea
{
    private String descripcion;
    private Boolean terminada;
    private int prioridad;
    private int id;
    private LocalDate fechaVencimiento;
    
    public Tarea(String nombre, int id)
    {
        descripcion = nombre;
        terminada = false;
        prioridad = 0;
        this.id = 0;
        fechaVencimiento = null;
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
        String fechaADevolver = "";
        if (terminada)
        {
            textoADevolver += "HECHA ";
        }
        if (fechaVencimiento != null)
        {
            int getDia = fechaVencimiento.getDayOfMonth();
            int getMes = fechaVencimiento.getMonthValue();
            int getAnio = fechaVencimiento.getYear();
            
            fechaADevolver = getDia + "-" + getMes + "-" + getAnio;
            textoADevolver += id + ". " + descripcion + " (" + prioridad + ") " + "Fecha de vencimiento: [" + fechaADevolver + "]";
        }
        else
        {
            textoADevolver += id + ". " + " (" + prioridad + ") ";
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
        fechaVencimiento = LocalDate.of(anio,mes,dia);
    }
    
    public LocalDate devolverFecha()
    {
        return fechaVencimiento;
    }
    
    public int obtenerPrioridad()
    {
        return prioridad;
    }
    
    public int getID()
    {
        return id;
    }
}
