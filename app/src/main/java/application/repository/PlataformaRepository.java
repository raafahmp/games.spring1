package application.repository;

import org.springframework.data.repository.CruRepository;
import application.model.Plataforma;
public interface PlataformaRepository extends CrudRepository<Plataforma, Long> {

}