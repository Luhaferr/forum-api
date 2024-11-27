package br.com.forumhub.forum_api.domain.topicos;

import java.time.LocalDateTime;

public record DadosListarTopico(String titulo, String mensagem, LocalDateTime dataCriacao, boolean status, String autor, String curso) {
}
