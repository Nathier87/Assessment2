package com.capgemini.Assessment2.Assessment2.Controller;

import com.capgemini.Assessment2.Assessment2.Model.Account;
import com.capgemini.Assessment2.Assessment2.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;


    @GetMapping
    private List<Account> getAccount(){
        return accountRepository.findAll();
    }

    @PostMapping
    public void addAccount(@RequestBody Account account){
        accountRepository.save(account);
    }
}
