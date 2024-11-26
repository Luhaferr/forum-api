package br.com.forumhub.forum_api.controller;

import br.com.forumhub.forum_api.domain.topicos.DadosCriarTopico;
import br.com.forumhub.forum_api.domain.topicos.Topico;
import br.com.forumhub.forum_api.domain.topicos.TopicosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicosRepository repository;

    @PostMapping
    @Transactional
    public void criarTopico(@RequestBody @Valid DadosCriarTopico dados) {
        repository.save(new Topico(dados));
    }
}
