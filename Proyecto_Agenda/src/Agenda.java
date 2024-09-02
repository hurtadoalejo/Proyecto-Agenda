/*
 * Taller Agenda - Programación 1 [03N - 20242]
 * Estudiante: Alejandro Hurtado Guerrero
 */

public class Agenda{
    public static void main(String[] args){
        Grupo grupo = new Grupo("Amiguitos", Categoria.AMIGOS);
        Reunion reunion = new Reunion("Salida a la playa", "24 noviembre", "9 a.m");
        Contacto contactoUno = new Contacto("Alejandro", "Alejo", "Mz A Casa 1", "7520250", "alejo@gmail.com");
        Contacto contactoDos = new Contacto("Veronica", "Vero", "Mz A Casa 2", "7520251", "vero@gmail.com");
        Contacto contactoTres = new Contacto("Sofia", "Sofi", "Mz A Casa 3", "7520252", "sofi@gmail.com");
        Contacto contactoCuatro = new Contacto("Fabio", "Fabi", "Mz A Casa 4", "7520253", "fabi@gmail.com");
        Contacto contactoQuinto = new Contacto("Nathali", "Natha", "Mz A Casa 5", "7520254", "natha@gmail.com");
        Contacto contactoSexto = new Contacto("Thomas", "Thomi", "Mz A Casa 6", "7520255", "thomi@gmail.com");
        grupo.agregarContacto(contactoUno);
        grupo.agregarContacto(contactoDos);
        grupo.agregarContacto(contactoTres);
        grupo.agregarContacto(contactoCuatro);
        grupo.agregarContacto(contactoQuinto);
        grupo.agregarContacto(contactoSexto);
        //System.out.println(grupo.toString());
        reunion.agregarContacto(contactoUno);
        reunion.agregarContacto(contactoDos);
        reunion.agregarContacto(contactoTres);
        reunion.agregarContacto(contactoCuatro);
        reunion.agregarContacto(contactoSexto);
        reunion.agregarContacto(contactoQuinto);
        System.out.println("\n" + reunion.toString());
    }
}