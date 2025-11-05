package com.basm.play;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PeliPlayAiService {
    @UserMessage("""
            Genera un saludo de Bienvenida a la plataforma de gestión de películas PeliPlay.
            Usa menos de 120 caracteres y te doy libertad para generar el tipo de saludo.
            """)
    String generateGreeting();
}
