    package com.example.findparty.config;

    import org.springframework.context.annotation.Configuration;
    import org.springframework.web.servlet.config.annotation.CorsRegistry;
    import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Configuration
    public class WebConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("http://localhost:3000") // Adaugă adresa de origine a frontend-ului tău React
                    .allowedMethods("GET", "POST", "PUT", "DELETE");
        }
    }
