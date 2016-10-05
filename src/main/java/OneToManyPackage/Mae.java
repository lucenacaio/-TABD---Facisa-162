	package OneToManyPackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Mae implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nome",length=25)
	private String nome;

	@OneToMany(targetEntity=Filho.class,cascade=CascadeType.PERSIST)
	private List<Filho> filhos;

	public Mae() {}

	public Mae(String nome) {
		this.nome = nome;
		this.filhos = new ArrayList<Filho>();
	}
	
	public void adicionaFilho(Filho filho) {
		filhos.add(filho);
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

	public List<Filho> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Filho> filhos) {
		this.filhos = filhos;
	}
}
