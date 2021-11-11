package com.springjwt.auth;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 11/11/2021
 **   Time : 11:38 AM
 **/
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class TokenManager {

	private static final int validity = 5 * 60 * 1000;
	Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	public String generateToken(String email) {
		return Jwts.builder()
				.setSubject(email)
				.setIssuer("www.eniyisi.com")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + validity))
				.signWith(key)
				.compact();
	}

	public boolean tokenValidate(String token) {
		if (getEmailToken(token) != null && isExpired(token)) {
			return true;
		}
		return false;
	}

	public String getEmailToken(String token) {
		Claims claims = getClaims(token);
		return claims.getSubject();
	}

	public boolean isExpired(String token) {
		Claims claims = getClaims(token);
		return claims.getExpiration().after(new Date(System.currentTimeMillis()));
	}

	private Claims getClaims(String token) {
		return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
	}

}