package com.zitrus.backendproject.service;

import com.zitrus.backendproject.model.Usuario;
import com.zitrus.backendproject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UsuarioService {


    @Autowired
    private final UsuarioRepository usuarioRepository;

    private final PasswordEncoder encoder;

    public UsuarioService(PasswordEncoder encoder, UsuarioRepository usuarioRepository) {
        this.encoder = encoder;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario usuario(Usuario usuario) {

        Usuario usuario = usuarioRepository.findByLogin(usuario.getCpf()).orElse(null);

        contaDTO.setSenha(encoder.encode(contaDTO.getSenha()));

        if (conta != null) {
            return new ContaDTO(conta);
        }
        conta = new Conta(contaDTO);
        contaRepository.save(conta);

        return new ContaDTO(conta);
    }
}
