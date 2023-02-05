package com.shravan.api.accounts.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @GetMapping("/status/check")
    public String getStatus() {
        return "Accounts Status: working";
    }
}
