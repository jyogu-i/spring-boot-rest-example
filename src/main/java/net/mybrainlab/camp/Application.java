package net.mybrainlab.camp;

import net.mybrainlab.camp.settings.BaseDBSettings;
import net.mybrainlab.camp.settings.CAMPSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

/*
 * This is the main Spring Boot application class. It configures Spring Boot, JPA, Swagger
 */

@SpringBootApplication
@Configuration
@EnableAutoConfiguration  // Sprint Boot Auto Configuration
@ComponentScan(basePackages = "net.khoubyari.example") // コンポーネントを使えるようにしてくれるいいやつ
//@EnableJpaRepositories("com.khoubyari.example.dao.jpa") // To segregate MongoDB and JPA repositories. Otherwise not needed.
public class Application extends SpringBootServletInitializer {

    private static final Class<Application> applicationClass = Application.class;
    private static final Logger log = LoggerFactory.getLogger(applicationClass);

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
    @Bean("dataSourceForDefault")
    @Primary
    public DataSource dataSourceForDefault(CAMPSettings settings) {
    return createDataSource(settings);
}
    private org.apache.tomcat.jdbc.pool.DataSource createDataSource(BaseDBSettings settings) {
        org.apache.tomcat.jdbc.pool.DataSource _dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
        _dataSource.setUrl(settings.getUrl());
        _dataSource.setDriverClassName(settings.getDriverClassName());
        _dataSource.setUsername(settings.getUsername());
        _dataSource.setPassword(settings.getPassword());
        _dataSource.setValidationQuery("SELECT 1 FROM DUAL");
        _dataSource.setMaxActive(5);
        _dataSource.setMaxIdle(1);
        _dataSource.setMaxWait(10000);
        _dataSource.setTestOnBorrow(true);
        _dataSource.setTestWhileIdle(true);
        return _dataSource;
    }
    @Bean PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
