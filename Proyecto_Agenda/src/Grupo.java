import java.util.Collection;
import java.util.LinkedList;

public class Grupo{
    private String nombre;
    private Categoria categoria;
    private Collection<Contacto> integrantesGrupo;
    private int cantidadIntegrantes;
    
    /**
     * Metodo constructor de la clase Grupo
     * @param nombre Nombre dado para definir el nombre del grupo
     * @param categoria Categoria dada para definir la categoria del grupo
     */
    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        integrantesGrupo = new LinkedList<>();
        cantidadIntegrantes = 0;
    }

    /**
     * Metodo para modificar el nombre del grupo
     * @param nombre El nuevo nombre del grupo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar la categoria del grupo
     * @param categoria La nueva categoria del grupo
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    /**
     * Metodo para modificar la lista de integrantes del grupo
     * @param integrantesGrupo La nueva lista de integrantes del grupo
     */
    public void setIntegrantesGrupo(Collection<Contacto> integrantesGrupo) {
        this.integrantesGrupo = integrantesGrupo;
    }

    /**
     * Metodo para obtener el nombre del grupo
     * @return El nombre del grupo
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener la categoria del grupo
     * @return La categoria del grupo
     */
    public Categoria getCategoria() {
        return categoria;
    }
    /**
     * Metodo para obtener la lista de integrantes del grupo
     * @return La lista de integrantes del grupo
     */
    public Collection<Contacto> getIntegrantesGrupo() {
        return integrantesGrupo;
    }
    
    /**
     * Metodo para agregar un contacto a un grupo
     * @param contacto El contacto que se piensa agregar al grupo
     */
    public void agregarContacto(Contacto contacto) {
        if (verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            integrantesGrupo.add(contacto);
            cantidadIntegrantes += 1;
        }
    }

    /**
     * Metodo para verificar si un contacto con el mismo nombre y telefono ya esta o no en un grupo y si no se a superado   el maximo de integrantes permitido
     * @param nombre Nombre del contacto a verificar
     * @param telefono Telefono del contacto a verificar
     * @return Booleano con la decision de si se podra agregar o no a la reunion
     */
    public boolean verificarContacto(String nombre, String telefono) {
        boolean centinela = true;
        if (cantidadIntegrantes < 5) {
            for (Contacto contactoPrueba : integrantesGrupo) {
                if (contactoPrueba.getNombre().equals(nombre) && contactoPrueba.getTelefono().equals(telefono)){
                    centinela = false;
                    break;
                }
            } 
        }
        else{
            centinela = false;
        }
        
        return centinela;
    }

    /**
     * Metodo para eliminar un contacto de un grupo
     * @param nombre Nombre del contacto a eliminar
     * @param telefono Telefono del contacto a eliminar
     */
    public void eliminarContacto(String nombre, String telefono) {
        for (Contacto contactoPrueba : integrantesGrupo) {
            if (contactoPrueba.getNombre().equals(nombre) && contactoPrueba.getTelefono().equals(telefono)) {
                cantidadIntegrantes -= 1;
                integrantesGrupo.remove(contactoPrueba);
                break;
            }
        }
    }

    /**
     * Metodo para generar toda la informacion relacionada con un grupo
     * @return Una cadena de texto con la informacion de un grupo
     */
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + ", cantidadIntegrantes=" + cantidadIntegrantes
                + ", integrantesGrupo=" + integrantesGrupo + "]";
    }
}