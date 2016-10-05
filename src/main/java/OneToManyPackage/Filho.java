package OneToManyPackage;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Filho implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nome",length=25)
	private String nome;
	@Column(name="idade",length=3)
	private int idade;

	public Filho() {}

	public Filho(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	

	
}
