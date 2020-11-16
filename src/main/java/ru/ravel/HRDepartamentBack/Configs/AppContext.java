package ru.ravel.HRDepartamentBack.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan
public class AppContext {
    private DBConfig dbConfig = new DBConfig();

    @Bean
    public DataSource dataSource() {
        return dbConfig.getDataSource();
    }
}
