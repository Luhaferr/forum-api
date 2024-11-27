package br.com.forumhub.forum_api.domain.topicos.validacoes;

import br.com.forumhub.forum_api.domain.topicos.DadosCriarTopico;
import br.com.forumhub.forum_api.domain.topicos.TopicosRepository;
import br.com.forumhub.forum_api.domain.topicos.ValidacaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorTopicoMesmoNomeEMensagem {

    @Autowired
    private TopicosRepository repository;

    public void validar(DadosCriarTopico dados) {
        var topicoComMesmoTituloEMensagem = repository.existsByTituloIgnoreCaseAndMensagemIgnoreCase(dados.titulo(), dados.mensagem());
        if (topicoComMesmoTituloEMensagem) {
            throw new ValidacaoException("Já existe um tópico com o mesmo título e mensagem");
        }
    }
}
