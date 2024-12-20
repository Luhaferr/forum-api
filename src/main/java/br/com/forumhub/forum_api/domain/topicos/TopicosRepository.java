package br.com.forumhub.forum_api.domain.topicos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicosRepository extends JpaRepository<Topico, Long> {

    boolean existsByTituloIgnoreCaseAndMensagemIgnoreCase(String titulo, String mensagem);
}
