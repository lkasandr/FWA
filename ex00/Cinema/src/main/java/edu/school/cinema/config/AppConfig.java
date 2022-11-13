package edu.school.cinema.config;

import edu.school.cinema.repositories.UsersRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UsersRepository usersRepository() {
        return new UsersRepository();
    }
}
