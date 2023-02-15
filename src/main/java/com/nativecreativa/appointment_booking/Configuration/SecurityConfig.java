package com.nativecreativa.appointment_booking.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final AuthProvider databaseAuthenticationProvider;

    public SecurityConfig(AuthProvider databaseAuthenticationProvider) {
        this.databaseAuthenticationProvider = databaseAuthenticationProvider;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

                 http.csrf().disable().authorizeRequests()
                .antMatchers("/","/fitness-centers","/about","/contact-us","/register","/login","/h2/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .failureUrl("/login?error=BadCredentials")
                .defaultSuccessUrl("/",true)
                .and()
                .logout().logoutUrl("/logout").clearAuthentication(true)
                .invalidateHttpSession(true).deleteCookies("JSESSIONID");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(databaseAuthenticationProvider);
    }


}
