package application.repository;

import org.springframework.data.repository.CruRepository;
import application.model.Categoria;
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

}