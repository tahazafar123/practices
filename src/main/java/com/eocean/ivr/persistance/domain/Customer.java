package com.eocean.ivr.persistance.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Customer extends BaseEntity {

    @Id
    private Long id;

    @NotNull
    @Column
    private String name;

    @Column(name = "c_name" ,length = 4667)
    private String contactNumber;

}
