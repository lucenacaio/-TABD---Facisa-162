package OneToOnePackage;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class CPF implements Serializable{

	@Id
	@GeneratedValue
	private int id;
	@Column(name="numero",length=11)
	private int numero;
	
	public CPF() {
	}

	public CPF(int numero) {
		super();
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}

