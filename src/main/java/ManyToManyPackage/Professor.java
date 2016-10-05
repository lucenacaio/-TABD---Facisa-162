package ManyToManyPackage;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Professor implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	@Column(name="nome",length=25)
	private String nome;
	@Column(name="sexo",length=9)
	private String sexo;
	
	@ManyToMany
	private Set<Disciplina> disciplinas = new HashSet<Disciplina>();
	
	public Professor() {		
	}

	public Professor(String nome, String sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void adicionaDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	

}
