package com.github.dilly3.digitalwalletapi.models;

import javax.persistence.Id;
import java.util.Date;

public class Transaction {
    @Id
    private Long id;
    private String customerId;
    private Operation transactionType;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

}
