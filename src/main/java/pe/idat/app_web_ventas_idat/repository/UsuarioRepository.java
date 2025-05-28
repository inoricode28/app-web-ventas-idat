package pe.idat.app_web_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.idat.app_web_ventas_idat.model.bd.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,
        Integer> {

    Usuario findByEmail(String email);

    Usuario findByNomusuario(String nomusuario);
}
