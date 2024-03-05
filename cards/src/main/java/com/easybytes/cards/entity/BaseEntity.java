package com.easybytes.cards.entity;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class    BaseEntity {

    @Column(updatable = false)
    public LocalDateTime createdAt;

    @Column(updatable = false)
    public String createdBy ;

    @Column(insertable  = false)
    public LocalDateTime updatedAt ;

    @Column(insertable  = false)
    public String updatedBy ;


}
