package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @Column(name="customer_id")
    private Long customerId;

    private String name  ;

    private String email ;

    @Column(name="mobile_number")
    private String mobileNumber;

}
