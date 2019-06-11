package br.com.sample.bankaccount.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Agency
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "agency")
public class Agency {

    @Id
    @GeneratedValue
    private Long id;

    private String bank;

    private String ag;

    private String address;

}

