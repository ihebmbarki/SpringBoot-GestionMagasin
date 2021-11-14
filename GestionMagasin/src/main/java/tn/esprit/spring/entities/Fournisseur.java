package tn.esprit.spring.entities;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table (name="Fournisseur")
public class Fournisseur implements Serializable{
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@NotNull
	    @Column(name = "idFournisseur")
		private Long idFournisseur;
		@Column(name="CodeFournisseur")
		private String CodeFournisseur;
		@Column(name="libelleFournisseur")
		private String libelleFournisseur;
		
		@ManyToMany 
		private Set <Produit> produit;
		public Long getIdFournisseur() {
			return idFournisseur;
		}
		public void setIdFournisseur(Long idFournisseur) {
			this.idFournisseur = idFournisseur;
		}
		public String getCodeFournisseur() {
			return CodeFournisseur;
		}
		public void setCodeFournisseur(String codeFournisseur) {
			CodeFournisseur = codeFournisseur;
		}
		public String getLibelleFournisseur() {
			return libelleFournisseur;
		}
		public void setLibelleFournisseur(String libelleFournisseur) {
			this.libelleFournisseur = libelleFournisseur;
		}
		public Fournisseur(Long idFournisseur, String codeFournisseur, String libelleFournisseur) {
			super();
			this.idFournisseur = idFournisseur;
			CodeFournisseur = codeFournisseur;
			this.libelleFournisseur = libelleFournisseur;
		}
		@Override
		public String toString() {
			return "Fournisseur [idFournisseur=" + idFournisseur + ", CodeFournisseur=" + CodeFournisseur
					+ ", libelleFournisseur=" + libelleFournisseur + "]";
		}
		public Fournisseur() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
