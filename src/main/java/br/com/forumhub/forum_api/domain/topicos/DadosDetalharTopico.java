package br.com.forumhub.forum_api.domain.topicos;

import java.time.LocalDateTime;

public record DadosDetalharTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao, boolean status, String autor, String curso) {
    public DadosDetalharTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.isStatus(), topico.getAutor(), topico.getCurso());
    }
}
