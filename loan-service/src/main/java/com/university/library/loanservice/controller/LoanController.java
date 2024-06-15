package com.university.library.loanservice.controller;

import com.university.library.loanservice.model.Loan;
import com.university.library.loanservice.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanRepository loanRepository;

    @GetMapping
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    @GetMapping("/{id}")
    public Loan getLoanById(@PathVariable Long id) {
        return loanRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Loan createLoan(@RequestBody Loan loan) {
        return loanRepository.save(loan);
    }

    @PutMapping("/{id}")
    public Loan updateLoan(@PathVariable Long id, @RequestBody Loan loanDetails) {
        Loan loan = loanRepository.findById(id).orElse(null);
        if (loan != null) {
            loan.setBookId(loanDetails.getBookId());
            loan.setSubscriberId(loanDetails.getSubscriberId());
            loan.setLoanDate(loanDetails.getLoanDate());
            loan.setReturnDate(loanDetails.getReturnDate());
            return loanRepository.save(loan);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteLoan(@PathVariable Long id) {
        loanRepository.deleteById(id);
    }
}
