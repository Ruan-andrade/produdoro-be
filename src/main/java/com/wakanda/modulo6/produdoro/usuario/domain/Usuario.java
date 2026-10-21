package com.wakanda.modulo6.produdoro.usuario.domain;

import com.wakanda.modulo6.produdoro.StatusUsuario;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Usuário")
public class Usuario {
    @Id
    private UUID idUsuario;
    @Email
    @Indexed
    private String email;
    private ConfiguracaoUsuario configuracao;
    @Builder.Default
    private StatusUsuario status = StatusUsuario.FOCO;
    @Builder.Default
    private Integer quantidadePomodoroPausaCurta = 0;

}
