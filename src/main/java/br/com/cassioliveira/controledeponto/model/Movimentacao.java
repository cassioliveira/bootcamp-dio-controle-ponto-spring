package br.com.cassioliveira.controledeponto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Movimentacao {

    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    @JoinColumn(name = "ocorrencia_id")
    private Ocorrencia ocorrencia;
    @ManyToOne
    @JoinColumn(name = "calendario_id")
    private Calendario calendario;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class MovimentacaoId implements Serializable{
        private long id;
        private long usuarioId;
    }

}
