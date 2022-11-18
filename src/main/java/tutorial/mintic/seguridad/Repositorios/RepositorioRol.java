package tutorial.mintic.seguridad.Repositorios;
import tutorial.mintic.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioRol extends MongoRepository<Rol,String> {
}
