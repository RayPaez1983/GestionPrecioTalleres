package usecase.out;

import entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryPort {
    User save(User user);
    Optional<User> findById(Long id);

    List<User> findAll();
    Optional<User> Update(User user);

}
