package tutorial.mintic.seguridad.Repositorios;
import tutorial.mintic.seguridad.Modelos.PermisosRoles;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}
