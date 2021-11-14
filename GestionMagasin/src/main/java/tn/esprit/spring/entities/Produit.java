package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import com.sun.istack.NotNull;

@Entity
@Table (name="Produit")
public class Produit implements Serializable{
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@NotNull
	    @Column(name = "idProduit")
		private Long idProduit;
		@Column(name = "codeProduit")
		private String codeProduit;
		@Column(name = "libelleProduit")
		private String libelleProduit;	
		@Column(name="prixUnitaire")
		private float prixUnitaire;
		
		@OneToMany (mappedBy="produit")
		private Set<DetailFacture> detailFacture;
		
		@OneToMany (mappedBy="produit")
		private Set<Rayon> rayon;
		
		@OneToMany (mappedBy="produit")
		private Set<Stock> stock;
		
		@ManyToMany 
		private Set <Fournisseur> fournisseur;
		
		@OneToOne
		private DetailProduit detailProduit;
		
		public Long getIdProduit() {
			return idProduit;
		}
		public void setIdProduit(Long idProduit) {
			this.idProduit = idProduit;
		}
		public String getCodeProduit() {
			return codeProduit;
		}
		public void setCodeProduit(String codeProduit) {
			this.codeProduit = codeProduit;
		}
		public String getLibelleProduit() {
			return libelleProduit;
		}
		public void setLibelleProduit(String libelleProduit) {
			this.libelleProduit = libelleProduit;
		}
		public float getPrixUnitaire() {
			return prixUnitaire;
		}
		public void setPrixUnitaire(float prixUnitaire) {
			this.prixUnitaire = prixUnitaire;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public Produit(Long idProduit, String codeProduit, String libelleProduit, float prixUnitaire) {
			super();
			this.idProduit = idProduit;
			this.codeProduit = codeProduit;
			this.libelleProduit = libelleProduit;
			this.prixUnitaire = prixUnitaire;
		}
		@Override
		public String toString() {
			return "Produit [idProduit=" + idProduit + ", codeProduit=" + codeProduit + ", libelleProduit="
					+ libelleProduit + ", prixUnitaire=" + prixUnitaire + "]";
		}
		public Produit() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		
}
