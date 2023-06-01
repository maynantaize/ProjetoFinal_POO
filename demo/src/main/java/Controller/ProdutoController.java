package Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Dto.ProdutoDto;

@RestController
@RequestMapping("produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoController service;
	
	private static final Logger log = LoggerFactory.getLogger(ProdutoController.class);

	@PostMapping
	public ProdutoDto adicionar(@RequestBody ProdutoDto produto) {
		log.info("filme criado: {}", produto);
		return service.adicionar(produto);
    }
	
	@PutMapping("id/{id}")
	public boolean atualizar(@PathVariable("id") Long id, @RequestBody ProdutoDto produto) {
		log.info("Atualização no produto: {} {}", id, produto);
		return service.atualizar(id, produto);
    }
	
	@DeleteMapping("id/{id}")
	public boolean excluir(@PathVariable("id") Long id) {
		log.info("Produto excluido: {}", id);
		return service.excluir(id);
    }
	
}

