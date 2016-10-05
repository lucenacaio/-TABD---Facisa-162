package OneToOnePackage;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Pessoa implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	@Column(name="nome",length=25)
	private String nome;
	
	@OneToOne
	private CPF cpf;
	
	
	public Pessoa() {	
	}

	public Pessoa(String nome,CPF cpf) {
		this.nome = nome;
		this.cpf = cpf;
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
	
}
