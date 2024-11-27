package br.com.forumhub.forum_api.domain.topicos;

import jakarta.validation.constraints.NotBlank;

public record DadosCriarTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {
}
