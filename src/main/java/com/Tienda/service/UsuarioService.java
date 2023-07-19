
package com.Tienda.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UsuarioService {
    
    public UserDetails loadUserByUsername(String usernam) throws UsernameNotFoundException;
    
    
}