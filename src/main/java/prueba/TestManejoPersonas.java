package prueba;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaJDBC personaDao = new PersonaJDBC();

        //Insertando un nuevo objeto tipo Persona
        Persona personaNueva = new Persona("Arturo", "Babel", "ababel@mail.com", "753159852");
        personaDao.insert(personaNueva);

//        //Modificar un objeto de persona existente
//        Persona personaModificar = new Persona(6, "Arturo Rafael", "Babel", "arbabel@mail.com", "753159858");
//        personaDao.update(personaModificar);
//
//        //Eliminar un registro
//        Persona personaEliminar = new Persona(6);
//        personaDao.delete(personaEliminar);

        //Mostrar datos
        List<Persona> personas = personaDao.select();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }
}
