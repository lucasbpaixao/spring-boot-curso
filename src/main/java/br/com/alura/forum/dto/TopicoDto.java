package br.com.alura.forum.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
	public static Page<TopicoDto> converter(Page<Topico> topicos){
		
		//Atualização do java 8 permite simplicação de codigos usando metodos estilo javaScript
		// .map = Está fazendo que para cada topico ele passe esse topicocomo parametro para o construtor do TopicoDto
		// Collector.toList() = transcforma o map em uma lista
		
		//topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
		
		return topicos.map(TopicoDto::new);
	}
}
