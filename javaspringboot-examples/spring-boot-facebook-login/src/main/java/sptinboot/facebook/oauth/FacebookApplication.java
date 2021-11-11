package sptinboot.facebook.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 11/11/2021
 **   Time : 12:47 PM
 **/
@SpringBootApplication
@EnableOAuth2Sso
public class FacebookApplication {
	public static void main(String[] args) {
		SpringApplication.run(FacebookApplication.class, args);
	}
}
