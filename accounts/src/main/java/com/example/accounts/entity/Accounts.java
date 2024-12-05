package com.example.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity //when class and column names are same
//@Table(name="") if class and column name are different
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Accounts extends BaseEntity {


    @Column(name="customer_id")
    //no need of @Column cuz names are matching
    private Long customerId;

    @Id
    private Long accountNumber;


    private String accountType;
    private String branchAddress;
    private String mobileNumber;

}
