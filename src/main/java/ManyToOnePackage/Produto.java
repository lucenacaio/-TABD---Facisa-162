package ManyToOnePackage;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Produto implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	@Column(name="nome",length=25)
	private String nome;
	@Column(name="valor",precision=3,scale=2)
	private double valor;
	@Column(name="qtd",length=3)
	private int quantidade;
	
	@ManyToOne(optional=false)
	private Categoria categoria;
	
	public Produto() {		
	}

	public Produto(String nome, double valor, int peso) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.quantidade = peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return quantidade;
	}

	public void setQtd(int qtd) {
		this.quantidade = qtd;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}
