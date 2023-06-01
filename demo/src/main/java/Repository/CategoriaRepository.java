package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

}
