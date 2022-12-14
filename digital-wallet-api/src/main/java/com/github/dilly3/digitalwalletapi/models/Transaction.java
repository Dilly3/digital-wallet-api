package com.github.dilly3.digitalwalletapi.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
    @Id
    @SequenceGenerator(name = "transaction_sequence",sequenceName = "transaction_sequence",allocationSize = 1,initialValue = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "transaction_sequence")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "account_number")
    private Customer customer;
    @Column(name = "transaction_type",columnDefinition = "varchar(25)")
    private Operation transactionType;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM-dd-yyyy hh:mm:ss",timezone = "Africa/Lagos")
    private Date createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM-dd-yyyy hh:mm:ss",timezone = "Africa/Lagos")
    private Date updatedAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMM-dd-yyyy hh:mm:ss",timezone = "Africa/Lagos")
    private Date deletedAt;
    


}
