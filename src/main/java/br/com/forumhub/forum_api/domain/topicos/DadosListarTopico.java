package br.com.forumhub.forum_api.domain.topicos;

import java.time.LocalDateTime;

public record DadosListarTopico(String titulo, String mensagem, LocalDateTime dataCriacao, boolean status, String autor, String curso) {
    public DadosListarTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.isStatus(), topico.getAutor(), topico.getCurso());
    }
}
