package usecase.in;

import entity.User;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface GetUserUseCase {
    @Bean
    User getAllUsers();

    List<User> findAll();
}
