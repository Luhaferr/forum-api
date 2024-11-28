package br.com.forumhub.forum_api.controller;

import br.com.forumhub.forum_api.domain.topicos.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicosRepository repository;

    @Autowired
    private GerenciadorDeTopico gerenciadorDeTopico;

    @PostMapping
    @Transactional
    public void criarTopico(@RequestBody @Valid DadosCriarTopico dados) {
        gerenciadorDeTopico.criar(dados);
    }

    @GetMapping
    public Page<DadosListarTopico> listar(@PageableDefault(size = 10, sort = {"dataCriacao"})Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListarTopico::new);
    }

    @GetMapping("/{id}")
    public DadosDetalharTopico detalhar(@PathVariable Long id) {
        Topico topico = repository.getReferenceById(id);
        return new DadosDetalharTopico(topico);
    }

    @PutMapping("/{id}")
    @Transactional
    public DadosDetalharTopico atualizar (@RequestBody @Valid DadosCriarTopico dados, @PathVariable Long id) {
        Topico topico = repository.getReferenceById(id);
        gerenciadorDeTopico.atualizar(dados);
        topico.atualizarTopico(dados);

        return new DadosDetalharTopico(topico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
