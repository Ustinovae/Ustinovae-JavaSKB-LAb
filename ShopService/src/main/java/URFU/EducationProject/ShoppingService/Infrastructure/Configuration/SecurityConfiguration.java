package URFU.EducationProject.ShoppingService.Infrastructure.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/shop/public/api/v1").permitAll()
                .antMatchers("/shop/admin/api/v1").hasAnyRole("Admin")
                .antMatchers("/shop/support/api/v1").hasAnyRole("Support")
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }

    @Bean
    public PasswordEncoder encoder() { return new BCryptPasswordEncoder(); }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        List<UserDetails> userDetailsList = new ArrayList<>();
        userDetailsList.add(User.withUsername("admin")
                .password(encoder().encode("cool"))
                .roles("Admin")
                .build());
        userDetailsList.add(User.withUsername("support")
                .password(encoder().encode("help"))
                .roles("Support")
                .build());

        return new InMemoryUserDetailsManager(userDetailsList);
    }
}
