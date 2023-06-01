package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Dto.ProdutoDto;
import Model.ProdutoModel;
import Repository.ProdutoRepository;

public class ProdutoService {

	@Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoDto adicionar(ProdutoDto produtoDto) {
        ProdutoModel produto = convertToModel(produtoDto);
        ProdutoModel novoProduto = produtoRepository.save(produto);
        return convertToDto(novoProduto);
    }

    private ProdutoDto convertToDto(ProdutoModel novoProduto) {
		
		return null;
	}

	private ProdutoModel convertToModel(ProdutoDto produtoDto) {
	
		return null;
	}

	public boolean atualizar(Long id, ProdutoDto produtoDto) {
        ProdutoModel produtoExistente = produtoRepository.findById(id).orElse(null);
        if (produtoExistente != null) {
            ProdutoModel produtoAtualizado = convertToModel(produtoDto);
            produtoAtualizado.setId(id);
            produtoRepository.save(produtoAtualizado);
            return true;
        }
        return false;
    }

    public boolean excluir(Long id) {
        ProdutoModel produto = produtoRepository.findById(id).orElse(null);
        if (produto != null) {
            produtoRepository.delete(produto);
            return true;
        }
        return false;
    }
}
