package com.github.dilly3.digitalwalletapi.models;



import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
//    @Column(
//            name = "account_number",
//            unique = true,
//            updatable = false,
//            nullable = false
//
//    )
    @JsonAlias("account_number")
    private BigDecimal accountNumber;
    private String firstname;
    private String lastname;
    @JsonIgnore
    private String password;
    private BigDecimal balance;
    @OneToMany(mappedBy = "customer") // field mapped to on the transactopn table
    private List<Transaction> transactions;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM-dd-yyyy hh:mm:ss",timezone = "Africa/Lagos")
    private Date createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM-dd-yyyy hh:mm:ss",timezone = "Africa/Lagos")
    private Date updatedAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM-dd-yyyy hh:mm:ss",timezone = "Africa/Lagos")
    private Date deletedAt;


}
