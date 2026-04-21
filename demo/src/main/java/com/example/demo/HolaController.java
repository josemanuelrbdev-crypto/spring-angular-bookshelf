package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String decirHola() {
        return "<html>" +
               "<head>" +
               "<title>Bienvenida Spring Boot</title>" +
               "<style>" +
               "  body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f0f2f5; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }" +
               "  .card { background: white; padding: 2rem; border-radius: 15px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); text-align: center; border-top: 5px solid #6db33f; }" +
               "  h1 { color: #333; }" +
               "  p { color: #666; font-size: 1.1rem; }" +
               "  .badge { background-color: #6db33f; color: white; padding: 5px 15px; border-radius: 20px; font-weight: bold; }" +
               "</style>" +
               "</head>" +
               "<body>" +
               "  <div class='card'>" +
               "    <h1>¡Bienvenido a tu App!</h1>" +
               "    <p>Has configurado <span class='badge'>Spring Boot</span> con éxito.</p>" +
               "    <p style='font-size: 0.8rem; color: #999;'>Servidor corriendo en el puerto 8081</p>" +
               "  </div>" +
               "</body>" +
               "</html>";
    }
}