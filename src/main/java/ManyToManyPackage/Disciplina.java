package ManyToManyPackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Disciplina implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	@Column(name="nome",length=25)
	private String nome;
	@Column(name="conteudo",length=600)
	private String conteudo;
	
	@ManyToMany(mappedBy="disciplinas", cascade=CascadeType.PERSIST)
	private List<Professor> professores= new ArrayList<Professor>();
	
	public Disciplina() {		
	}

	public Disciplina(String nome, String conteudo) {
		super();
		this.nome = nome;
		this.conteudo = conteudo;
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

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public void adicionaProfessor(Professor newProfessor) {
		professores.add(newProfessor);
	}
	
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	public List<Professor> getAlunos() {
		return professores;
	}
	
}
