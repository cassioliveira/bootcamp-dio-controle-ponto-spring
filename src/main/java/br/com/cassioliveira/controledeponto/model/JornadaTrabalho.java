package br.com.cassioliveira.controledeponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Audited
@Entity
public class JornadaTrabalho {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String descricao;
}