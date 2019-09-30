package com.example.d20.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d20.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

  boolean existsByUsername(String username);

  Account findByUsername(String username);

  @Transactional
  void deleteByUsername(String username);

}
