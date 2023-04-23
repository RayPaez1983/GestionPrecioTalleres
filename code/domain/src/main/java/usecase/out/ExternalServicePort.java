package usecase.out;

import entity.User;

public interface ExternalServicePort {
    User getAllUser(Long userId);
}
