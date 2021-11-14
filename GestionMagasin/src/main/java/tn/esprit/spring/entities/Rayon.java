package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="Rayon")
public class Rayon implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@NotNull
    @Column(name = "idRayon")
	private Long idRayon;
	@Column (name="codeRayon")
	private String codeRayon;
	@Column (name="libelleRayon")
	private String libelleRayon;
	@ManyToOne
	Produit produit;
	
	
	
	public Long getIdRayon() {
		return idRayon;
	}
	public void setIdRayon(Long idRayon) {
		this.idRayon = idRayon;
	}
	public String getCodeRayon() {
		return codeRayon;
	}
	public void setCodeRayon(String codeRayon) {
		this.codeRayon = codeRayon;
	}
	public String getLibelleRayon() {
		return libelleRayon;
	}
	public void setLibelleRayon(String libelleRayon) {
		this.libelleRayon = libelleRayon;
	}
	public Rayon(Long idRayon, String codeRayon, String libelleRayon) {
		super();
		this.idRayon = idRayon;
		this.codeRayon = codeRayon;
		this.libelleRayon = libelleRayon;
	}
	@Override
	public String toString() {
		return "Rayon [idRayon=" + idRayon + ", codeRayon=" + codeRayon + ", libelleRayon=" + libelleRayon + "]";
	}
	public Rayon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
