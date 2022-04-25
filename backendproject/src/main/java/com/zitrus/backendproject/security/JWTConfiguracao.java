//package com.zitrus.backendproject.security;
//
//import com.zitrus.backendproject.service.DetalheUsuarioService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//@EnableWebSecurity
//public class JWTConfiguracao extends WebSecurityConfigurerAdapter {
//
//    private final DetalheUsuarioService detalheUsuarioService;
//    private final PasswordEncoder passwordEncoder;
//
//    public JWTConfiguracao(DetalheUsuarioService detalheUsuarioService, PasswordEncoder passwordEncoder) {
//        this.detalheUsuarioService = detalheUsuarioService;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(detalheUsuarioService).passwordEncoder(passwordEncoder);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeRequests()
//                .antMatchers("/login", "/cadastrar").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .addFilter(new JWTAutenticarFilter(authenticationManager()))
//                .addFilter(new JWTAutenticarFilter(authenticationManager()))
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    }
//
//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//
//        CorsConfiguration corsConfiguration = new CorsConfiguration().applyPermitDefaultValues();
//        source.registerCorsConfiguration("/**", corsConfiguration);
//
//        return source;
//    }
//
//}
