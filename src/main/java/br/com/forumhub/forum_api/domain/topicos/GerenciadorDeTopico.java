package br.com.forumhub.forum_api.domain.topicos;

import br.com.forumhub.forum_api.domain.topicos.validacoes.ValidadorTopicoMesmoNomeEMensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GerenciadorDeTopico {

    @Autowired
    private TopicosRepository repository;

    @Autowired
    private ValidadorTopicoMesmoNomeEMensagem validador;

    public void criar(DadosCriarTopico dados) {
        validador.validar(dados);
        repository.save(new Topico(dados));
    }

    public void atualizar(DadosCriarTopico dados) {
        validador.validar(dados);
    }
}
