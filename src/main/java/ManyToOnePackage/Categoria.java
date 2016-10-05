package ManyToOnePackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.eclipse.persistence.internal.localization.ToStringLocalization;

import OneToManyPackage.Filho;


@Entity
public class Categoria implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	@Column(name="nome",length=25)
	private String nome; 
	
	@OneToMany(mappedBy="categoria",cascade=CascadeType.PERSIST)
	private List<Produto> produtos = new ArrayList<Produto>();
	
	
	public Categoria() {
	}

	public Categoria(String nome) {
		super();
		this.nome = nome;
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
	
	public void adicionaProduto(Produto newProduto) {
		produtos.add(newProduto);
	}
	
	public List<Produto> getProcutos() {
		return produtos;
	}
	
	public void setProdutor(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public String toString()
	{ return nome;
		
	}
	

}
