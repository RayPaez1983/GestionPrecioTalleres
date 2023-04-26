package com.inditex.masterwwsc.domain.usecase;

import java.util.List;

import com.inditex.masterwwsc.domain.entity.Product;

/**
 * The interface Find all products use case.
 */
public interface FindAllUsersUseCase {

  /**
   * Find all products flux.
   * 
   * @return the product list
   */
  List<User> findAllUsers();

}
