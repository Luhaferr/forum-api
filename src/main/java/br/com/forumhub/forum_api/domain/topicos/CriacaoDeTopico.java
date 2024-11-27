package br.com.forumhub.forum_api.domain.topicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriacaoDeTopico {

    @Autowired
    private TopicosRepository repository;

    public void criar(DadosCriarTopico dados) {
        var topicoComMesmoTituloEMensagem = repository.existsByTituloIgnoreCaseAndMensagemIgnoreCase(dados.titulo(), dados.mensagem());
        if (topicoComMesmoTituloEMensagem) {
            throw new ValidacaoException("Já existe um tópico com o mesmo título e mensagem");
        }
        repository.save(new Topico(dados));
    }
}
