package edu.utvt.springdata;

import edu.utvt.springdata.data.entities.Student;
import edu.utvt.springdata.data.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {
        Student student = new Student(null, "Don Gato","y su Pandilla");
            studentRepository.save(student);
    }

}
