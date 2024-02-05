package net.javafoster.bankingapp.service;

import net.javafoster.bankingapp.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    AccountDto updatePersonalDetails(Long id, String accountHolderName, String email);

    void deleteAccount(Long id);
}
