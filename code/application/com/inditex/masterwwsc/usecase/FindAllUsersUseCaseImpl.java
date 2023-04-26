package com.inditex.masterwwsc.usecase;

import java.util.List;

import com.inditex.masterwwsc.domain.entity.Product;
import com.inditex.masterwwsc.domain.repository.ProductRepository;
import com.inditex.masterwwsc.domain.usecase.FindAllProductsUseCase;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

/**
 * The type Find all products use case.
 */
@Component
public class FindAllUsersUseCaseImpl implements FindAllUsersUseCase {

  private final Logger logger;

  private final UsersRepository usersRepository;

  /**
   * Instantiates a new Find all products use case.
   * 
   * @param logger the logger
   * @param usersRepository the product repository
   */
  public FindAllUsersUseCaseImpl(final Logger logger, final ProductRepository productRepository) {
    this.logger = logger;
    this.usersRepository = usersRepository;
  }

  @Override
  public List<User> findAllProducts() {
    this.logger.debug("Find findAllProducts");
    return this.usersRepository.findAllUsers();
  }

}