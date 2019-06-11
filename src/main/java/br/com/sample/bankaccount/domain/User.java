package br.com.sample.bankaccount.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * User
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column
    private String email;

    private String cep;

    private String account;

    @ManyToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;

}

