package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String email;
    @JsonIgnore
    private Integer idPessoa;
}
