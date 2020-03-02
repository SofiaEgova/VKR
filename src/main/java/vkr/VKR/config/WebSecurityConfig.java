package vkr.VKR.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import vkr.VKR.repo.UsrRepo;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().mvcMatchers("/").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout().permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService(){
        UserDetails user = User.withDefaultPasswordEncoder().username("u").password("1").roles("USER").build();
        return new InMemoryUserDetailsManager(user);
    }
//
//    @Bean
//    public PrincipalExtractor principalExtractor(UsrRepo usrRepo){
//        return map -> {
//            return new User();
//        };
//    }

}
