package br.com.cassioliveira.controledeponto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Empresa {

    @Id
    private Long id;
    private String descricao;
    private String cpf;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}
