package usecase;

import entity.User;

import java.util.Optional;

public interface UpdateUserUseCase {
    Optional<User> updateUser(Long ig, User updateUser);
}
