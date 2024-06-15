package com.university.library.loanservice.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long bookId;

    @Column(nullable = false)
    private Long subscriberId;

    @Column(nullable = false)
    private Date loanDate;

    @Column(nullable = false)
    private Date returnDate;

    // Getters and Setters
}
