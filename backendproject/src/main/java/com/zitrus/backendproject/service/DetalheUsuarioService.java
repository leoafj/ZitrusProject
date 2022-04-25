//package com.zitrus.backendproject.service;
//
//import Data.DetalheUsuarioData;
//import com.zitrus.backendproject.model.Usuario;
//import com.zitrus.backendproject.repository.UsuarioRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class DetalheUsuarioService implements UserDetailsService {
//
//    private final UsuarioRepository repository;
//
//    public DetalheUsuarioService(UsuarioRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
//        Optional<Usuario> usuario = repository.findByLogin(login);
//        if (usuario.isEmpty()) {
//            throw new UsernameNotFoundException("Usuário ["+ login +"] não encontrado");
//        }
//
//        return new DetalheUsuarioData(usuario);
//    }
//}
