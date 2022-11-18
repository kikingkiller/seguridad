package tutorial.mintic.seguridad.Repositorios;
import tutorial.mintic.seguridad.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}