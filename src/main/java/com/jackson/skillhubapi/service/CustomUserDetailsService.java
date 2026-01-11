package com.jackson.skillhubapi.service;

import com.jackson.skillhubapi.entity.Usuario;
import com.jackson.skillhubapi.security.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.findAllByEmail(email);

        if (usuario == null){
            throw new UsernameNotFoundException("User not found");
        }

        return new CustomUserDetails(usuario);
    }



}
