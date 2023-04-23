package usecase.out;

import entity.User;
import repository.UserRepository;
import usecase.in.GetUserUseCase;

import java.util.List;
import java.util.Optional;

public class GetUserUseCaseImpl implements GetUserUseCase {
    private UserRepository userRepository;

    public GetUserUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getAllUsers() {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
