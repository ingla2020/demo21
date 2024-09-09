package com.example.demo.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.PrintWriter;

@Component
public class CustomAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {

        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setHeader("WWW-Authenticate", "Basic realm=" + getRealmName());
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);

        PrintWriter writer = response.getWriter();
        writer.println("HTTP Status 401 : " + authException.getMessage());

    }

    @Override
    public void afterPropertiesSet()  {
        setRealmName("sisis");
        super.afterPropertiesSet();
    }
}
