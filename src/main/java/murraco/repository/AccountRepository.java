package murraco.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import murraco.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

  boolean existsByUsername(String username);

  Account findByUsername(String username);

  @Transactional
  void deleteByUsername(String username);

}
