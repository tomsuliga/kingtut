package org.suliga.kingtut.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class KingTutSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity hs) throws Exception {
		hs.authorizeRequests()
			.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
			.antMatchers("/dba/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')")
			.antMatchers("/**").permitAll();
			//.and().httpBasic()
			//.and().formLogin().loginPage("/login");
		
		// for posting form data	
		hs.csrf().disable();
			
		// add this line to use H2 web console
	    hs.headers().frameOptions().disable();
	    hs.csrf().ignoringAntMatchers("/h2-console/**", "/console/**");
	}
}
