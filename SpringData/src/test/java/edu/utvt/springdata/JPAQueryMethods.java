package edu.utvt.springdata;

import edu.utvt.springdata.data.entities.Player;
import edu.utvt.springdata.data.repositories.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@SpringBootTest
public class JPAQueryMethods {
    @Autowired
    private PlayerRepository playerRepository;

    @Test
    void findByFullName() {
        String fullname = "Harrison Ingram";
        this.playerRepository.findByFullname(fullname).forEach(System.out::println);

    }

    @Test
    void findByFullnameContaining() {
        String name = "Harrison";
        this.playerRepository.findByFullnameContaining(name).forEach(System.out::println);
    }

    @Test
    void findByTeam() {
        String team = "Uta";
        Integer age = 21;
        this.playerRepository.findByTeamAndAge(team, age).forEach(System.out::println);
    }

    @Test
    void findByTeamAndPeageble() {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Player> page = this.playerRepository.findByTeam("Cha", pageable);
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
    }
}
