package com.github.dilly3.digitalwalletapi.models;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    @Column(
            name = "account_number",
            unique = true,
            updatable = false,
            nullable = false

    )

    private String accountNumber;
    private BigDecimal balance;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    @OneToMany(fetch = FetchType.EAGER)
    private Transaction transactions;

}
