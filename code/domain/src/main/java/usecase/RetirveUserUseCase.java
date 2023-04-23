package usecase;

import entity.User;

import java.util.List;
import java.util.Optional;

public interface RetirveUserUseCase {
    Optional<User> getTask(Long id);
    List<User>getAllUsers();
}
