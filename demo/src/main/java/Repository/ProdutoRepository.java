package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

}
