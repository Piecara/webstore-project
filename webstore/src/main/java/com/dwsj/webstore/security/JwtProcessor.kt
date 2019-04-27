package com.dwsj.webstore.security

import com.nimbusds.jose.JWSAlgorithm
import com.nimbusds.jose.jwk.source.JWKSource
import com.nimbusds.jose.jwk.source.RemoteJWKSet
import com.nimbusds.jose.proc.JWSVerificationKeySelector
import com.nimbusds.jose.util.DefaultResourceRetriever
import com.nimbusds.jwt.proc.ConfigurableJWTProcessor
import com.nimbusds.jwt.proc.DefaultJWTProcessor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JwtProcessor {
    @Value("\${cognito.keys}")
    private val keySource: String = ""
    @Bean
    fun configurableJWTProcessor(): ConfigurableJWTProcessor<*> {
        val resourceRetriever = DefaultResourceRetriever(5000, 5000)
        val jwkSetURL = URL(keySource)
        val keySource: JWKSource<SecurityContext> = RemoteJWKSet(jwkSetURL, resourceRetriever)
        val jwtProcessor: ConfigurableJWTProcessor<SecurityContext> = DefaultJWTProcessor()
        val keySelector = JWSVerificationKeySelector(JWSAlgorithm.RS256, keySource)
        jwtProcessor.setJWSKeySelector(keySelector)
        return jwtProcessor
    }
}