package br.com.cassioliveira.controledeponto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Calendario {

    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name = "tipodata_id")
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;

}
