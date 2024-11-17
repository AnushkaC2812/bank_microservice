package com.example.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.annotation.processing.Generated;

@Entity //when class and column names are same
//@Table(name="") if class and column name are different
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    @Column(name="customer_id")
    //no need of @Column cuz names are matching
    private Long customerId;

    private String name;
    private String email;
    private String mobileNumber;

}
