package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaResponse {
    private  String errors;
    private  String timestamp;
    private  Integer status;
}
