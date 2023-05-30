package david.corral.tfc.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class DatabaseWebSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
        .dataSource(dataSource).usersByUsernameQuery("select usuario, password, estatus from clientes where usuario=?")
        .authoritiesByUsernameQuery("select c.usuario, p.perfil from usuarioperfil up "
                + "inner join clientes c on c.id = up.idUsuario "
                + "inner join perfiles p on p.id = up.idPerfil where c.usuario = ?");
     
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/bootstrap/**",
                                            "/images/**",
                                            "/tinimce/**",
                                            "/css/**",
                                            "/img/**",
                                            "/logo/**").permitAll().antMatchers("/",				
                                                                                "/login",
                                                                                "/singup",
                                                                                "/contacto",
                                                                                "/search",
                                                                                "/saveuser",
                                                                                "/encriptar/**",
                                                                                "/juego/lista").permitAll().antMatchers("/coches/**").hasAnyAuthority("ADMIN")
                                                                                                                .anyRequest().authenticated().and().formLogin().loginPage("/login").failureUrl("/login?error=true").permitAll();		
        }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder();
    }

}