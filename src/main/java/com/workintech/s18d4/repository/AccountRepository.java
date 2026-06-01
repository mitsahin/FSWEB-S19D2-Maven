package com.workintech.s18d4.repository;

import com.workintech.s18d4.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AccountRepository extends JpaRepository<Account, Long> {
}
