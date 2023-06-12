package com.listaFilmes.ListaFilmes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicSecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception  {

			/*
			http.csrf().disable()
							.authorizeHttpRequests()
							.requestMatchers("/login").permitAll()
							.requestMatchers("/paginas/**", "/js/**", "/img/**").permitAll()
							.requestMatchers("/dados-pessoais").hasAuthority("LORD_SITH")
							.requestMatchers("/conhecimentos").hasAnyAuthority("JEDI")
							.anyRequest().authenticated()
							.and()
							.formLogin().disable()
							.sessionManagement()
							.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

			// Adicionando filtro no fluxo de autorização
			http.addFilterBefore(jwtFilter(), UsernamePasswordAuthenticationFilter.class);
			*/
			http.csrf().disable()
							.authorizeHttpRequests()
							.anyRequest().permitAll();

			return http.build();
	}

}