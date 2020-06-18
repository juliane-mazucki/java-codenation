package br.codenation.cursojava.aula8.security;

import br.codenation.cursojava.aula8.security.model.Permission;
import br.codenation.cursojava.aula8.security.model.User;
import br.codenation.cursojava.aula8.security.repository.PermissionRepository;
import br.codenation.cursojava.aula8.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class ExampleUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found.");
        }

        return new SystemUser(user.getName(), user.getUsername(), user.getPassword(), authorities(user));
    }

    public Collection<? extends GrantedAuthority> authorities(User user) {
        List<Permission> permissions = permissionRepository.findByUsers(user);
        return permissions.stream().map(p -> new SimpleGrantedAuthority("ROLE_" + p.getName())).collect(toList());
    }
}