package pl.finsys.customLoginForm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("123456").roles("USER");
    }

    //.csrf() jest opcjonalny, wlaczony domyslnie, jesli korzystasz z konstruktora WebSecurityConfigurerAdapter
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
            .antMatchers("/admin/**").access("hasRole('ROLE_USER')")
            .and()
            .formLogin().loginPage("/login").failureUrl("/login?error")
            .usernameParameter("username").passwordParameter("password")
            .and()
            .logout().logoutSuccessUrl("/login?logout")
            .and()
            .csrf();
    }
}