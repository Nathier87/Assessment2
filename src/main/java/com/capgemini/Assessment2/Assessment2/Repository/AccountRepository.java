package com.capgemini.Assessment2.Assessment2.Repository;


import com.capgemini.Assessment2.Assessment2.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
