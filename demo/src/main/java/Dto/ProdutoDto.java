package Dto;

import Model.CategoriaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {

	private Long id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    
    private CategoriaModel categoria;
}
