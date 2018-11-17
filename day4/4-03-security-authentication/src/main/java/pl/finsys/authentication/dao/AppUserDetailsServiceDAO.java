package pl.finsys.authentication.dao;

import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AppUserDetailsServiceDAO implements UserDetailsService {

    protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public UserDetails loadUserByUsername(final String username)
        throws UsernameNotFoundException {

        logger.info("loadUserByUsername username=" + username);

        if (!username.equals("user")) {
            throw new UsernameNotFoundException(username + " not found");
        }

        //tworzymy tutaj sztucznego usera, w rzeczywistosci mozemy siegnac np. do JDBC
        //lub innego zewnetrznego systemu
        return new UserDetails() {

            private static final long serialVersionUID = 2059202961588104658L;

            @Override
            public boolean isEnabled() {
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                return true;
            }

            @Override
            public boolean isAccountNonExpired() {
                return true;
            }

            @Override
            public String getUsername() {
                return username;
            }

            @Override
            public String getPassword() {
                return "12345";
            }

            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                List<SimpleGrantedAuthority> auths = new java.util.ArrayList<>();
                auths.add(new SimpleGrantedAuthority("admin"));
                return auths;
            }
        };
    }

}
