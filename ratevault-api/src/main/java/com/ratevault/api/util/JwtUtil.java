package com.ratevault.api.util;



import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;

public class JwtUtil {

    private static final String SECRET = "MySuperSecretKeyForJwtRateVault123456789"; // Keep long and secure

    public static String extractPlan(String token) {
        try {
            SecretKey key = Keys.hmacShaKeyFor(SECRET.getBytes());
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token.replace("Bearer ", ""))
                    .getBody();

            return claims.get("plan", String.class); // Example claim: { "plan": "FREE" }
        } catch (Exception e) {
            return "FREE"; // Default fallback
        }
    }
}
