import java.util.Collection;
import java.util.LinkedList;

public class Reunion{
    private String descripcion;
    private String fecha;
    private String hora;
    private Collection<Contacto> asistentesReunion;

    /**
     * Metodo constructor de la clase Reunion
     * @param descripcion Descripcion dada para definir la descripcion de la reunion
     * @param fecha Fecha dada para definir la fecha de la reunion
     * @param hora Hora dada para definir la hora de la reunion
     */
    public Reunion(String descripcion, String fecha, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        asistentesReunion = new LinkedList<>();
    }

    /**
     * Metodo para modificar la descripcion de la reunion
     * @param descripcion La nueva descripcion de la reunion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Metodo para modificar la fecha de la reunion
     * @param descripcion La nueva fecha de la reunion
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * Metodo para modificar la hora de la reunion
     * @param descripcion La nueva hora de la reunion
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    /**
     * Metodo para modificar la lista de asistentes a la reunion
     * @param descripcion La nueva lista de asistentes a la reunion
     */
    public void setAsistentesReunion(Collection<Contacto> asistentesReunion) {
        this.asistentesReunion = asistentesReunion;
    }
    
    /**
     * Metodo para obtener la descripcion de la reunion
     * @return La descripcion de la reunion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Metodo para obtener la fecha de la reunion
     * @return La fecha de la reunion
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * Metodo para obtener la hora de la reunion
     * @return La hora de la reunion
     */
    public String getHora() {
        return hora;
    }
    /**
     * Metodo para obtener la lista de asistentes a la reunion
     * @return La lista de asistentes a la reunion
     */
    public Collection<Contacto> getAsistentesReunion() {
        return asistentesReunion;
    }

    /**
     * Metodo para agregar un contacto a una reunion
     * @param contacto El contacto que se piensa agregar a la reunion
     */
    public void agregarContacto(Contacto contacto) {
        if (verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            asistentesReunion.add(contacto);
        }
    }
    
    /**
     * Metodo para verificar si un contacto con el mismo nombre y telefono ya esta o no en una reunion
     * @param nombre Nombre del contacto a verificar
     * @param telefono Telefono del contacto a verificar
     * @return Booleano con la decision de si se podra agregar o no a la reunion
     */
    public boolean verificarContacto(String nombre, String telefono) {
        boolean centinela = true;
        for (Contacto contactoPrueba : asistentesReunion) {
            if (contactoPrueba.getNombre().equals(nombre) && contactoPrueba.getTelefono().equals(telefono)) {
                centinela = false;
            }
        }
        return centinela;
    }

    /**
     * Metodo para eliminar un contacto de una reunion
     * @param nombre Nombre del contacto a eliminar
     * @param telefono Telefono del contacto a eliminar
     */
    public void eliminarContacto(String nombre, String telefono) {
        for (Contacto contactoPrueba : asistentesReunion) {
            if (contactoPrueba.getNombre().equals(nombre) && contactoPrueba.getTelefono().equals(telefono)) {
                asistentesReunion.remove(contactoPrueba);
                break;
            }
        }
    }
    
    /**
     * Metodo para generar toda la informacion relacionada con una reunion
     * @return Una cadena de texto con la informacion de una reunion
     */
    public String toString() {
        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", asistentesReunion="
                + asistentesReunion + "]";
    }  
}