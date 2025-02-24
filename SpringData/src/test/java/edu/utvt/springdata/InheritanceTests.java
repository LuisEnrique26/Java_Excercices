package edu.utvt.springdata;

import edu.utvt.springdata.data.entities.Administrativo;
import edu.utvt.springdata.data.entities.Alumno;
import edu.utvt.springdata.data.repositories.AdministrativoRepository;
import edu.utvt.springdata.data.repositories.AlumnoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class InheritanceTests {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private AdministrativoRepository administrativoRepository;

    @Test
    void contextLoads() {
        Alumno alumno = new Alumno("Sami", "Neri", "Sami@gmail.com", new Date());
        alumnoRepository.save(alumno);

        Administrativo administrativo = new Administrativo("Luis", "Peña", "luis@gmail.com", new Date(), 100.1);
        administrativoRepository.save(administrativo);
    }
}
