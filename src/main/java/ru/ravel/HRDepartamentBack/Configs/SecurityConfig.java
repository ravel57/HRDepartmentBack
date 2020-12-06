package ru.ravel.HRDepartamentBack.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;
import ru.ravel.HRDepartamentBack.Models.UserRoleEnum;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {


//    private final UserDetailsService userDetailsService;

//    @Autowired
//    public SecurityConfig(@Qualifier("userDetailsServiceImpl") UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        http.addFilterBefore(filter, CsrfFilter.class);
        http.authorizeRequests()
                .antMatchers("/api/v1/auth").permitAll()
                .antMatchers("/api/v1/").authenticated()
                .antMatchers("/", "/js/", "/css/**").permitAll();
        http.csrf().disable();
    }

//    @Bean
//    protected UserDetailsService userDetailsService() {
//        return new InMemoryUserDetailsManager(
//                User.builder()
//                        .username("admin")
//                        .password(passwordEncoder().encode("chmo"))
//                        .roles(UserRoleEnum.ADMIN.name())
//                        .build(),
//                User.builder()
//                        .username("huesos")
//                        .password(passwordEncoder().encode("huesos"))
//                        .roles(UserRoleEnum.USER.name())
//                        .build()
//        );
//    }

    @Bean
    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12);
    }

}
