package com.Ausix.backEnd.controllers;

import com.Ausix.backEnd.models.Transaction;
import com.Ausix.backEnd.services.TransactionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "http://localhost:5173")
public class TransactionController {
    private final TransactionService transactionService;

    private TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @GetMapping
    private List<Transaction> getAllTransactions(){
        return transactionService.getAllTransactions();
    }
}
