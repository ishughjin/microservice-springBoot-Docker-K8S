package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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

    @Size(min = 5, max = 10, message = "The Length of the Customer Name Should be between 5 and 30")
    private String name  ;

    @NotEmpty(message = "The Email Address can not be null or empty")
    @Email(message = "Email should be a valid value")
    private String email ;

    @Pattern(regexp = "$|[0-9]{10}", message = "Mobile Number Must Be 10 Digits")
    @Column(name="mobile_number")
    private String mobileNumber;

}
