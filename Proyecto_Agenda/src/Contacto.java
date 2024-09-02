public class Contacto{
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;

    /**
     * Metodo constructor de la clase Contacto
     * @param nombre Nombre dado para definir el nombre del contacto
     * @param alias Alias dado para definir el alias del contacto
     * @param direccion Direccion dada para definir la direccion del contacto
     * @param telefono Telefono dado para definir el telefono del contacto
     * @param email Email dado para definir el email del contacto
     */
    public Contacto(String nombre, String alias, String direccion, String telefono, String email){
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Metodo para modificar el nombre del contacto
     * @param nombre El nuevo nombre del contacto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;  
    }
    /**
     * Metodo para modificar el alias del contacto
     * @param alias El nuevo alias del contacto
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
    /**
     * Metodo para modificar la direccion del contacto
     * @param direccion La nueva direccion del contacto
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo para modificar el telefono del contacto
     * @param telefono El nuevo telefono del contacto
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Metodo para modificar el email del contacto
     * @param email El nuevo email del contacto
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo para obtener el nombre del contacto
     * @return El nombre del contacto
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener el nombre del contacto
     * @return El alias del contacto
     */
    public String getAlias() {
        return alias;
    }
    /**
     * Metodo para obtener el nombre del contacto
     * @return La direccion del contacto
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo para obtener el nombre del contacto
     * @return El telefono del contacto
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * Metodo para obtener el nombre del contacto
     * @return El email del contacto
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo para generar toda la informacion relacionada con un contacto
     * @return Una cadena de texto con la informacion de un contacto
     */
    public String toString() {
        return "Contacto [nombre=" + nombre + ", alias=" + alias + ", direccion=" + direccion + ", telefono=" + telefono
                + ", email=" + email + "]";
    }
}