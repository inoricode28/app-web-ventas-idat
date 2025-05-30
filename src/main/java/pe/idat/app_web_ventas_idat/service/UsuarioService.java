package pe.idat.app_web_ventas_idat.service;



import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.idat.app_web_ventas_idat.model.bd.Rol;
import pe.idat.app_web_ventas_idat.model.bd.Usuario;
import pe.idat.app_web_ventas_idat.repository.RolRepository;
import pe.idat.app_web_ventas_idat.repository.UsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;

@Service
@AllArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder =
            new BCryptPasswordEncoder();

    public Usuario buscarUsuarioPorEmail(String email){

        return usuarioRepository.findByEmail(email);
    }

    public Usuario buscarUsuarioPorNombreUsuario(String username){
        return usuarioRepository.findByNomusuario(username);
    }

    public Usuario guardarUsuario(Usuario usuario){
        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
        usuario.setActivo(true);
        Rol usuarioRol = rolRepository.findByNomrol("ADMIN");
        usuario.setRoles( new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepository.save(usuario);

        }
}
