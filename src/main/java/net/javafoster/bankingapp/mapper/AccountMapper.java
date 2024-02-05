package net.javafoster.bankingapp.mapper;

import net.javafoster.bankingapp.dto.AccountDto;
import net.javafoster.bankingapp.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getEmail(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getEmail(),
                account.getBalance()
        );
        return accountDto;
    }
}
