package br.com.cassioliveira.controledeponto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BancoHoras {

    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quandidadeHoras;
    private BigDecimal saldoHoras;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class BancoHorasId implements Serializable {
        private long id;
        private long movimentacaoId;
        private long usuarioId;
    }

}
