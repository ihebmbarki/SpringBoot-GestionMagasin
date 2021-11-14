package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

@Entity
@Table (name="DetailFacture")
public class DetailFacture implements Serializable{
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@NotNull
	    @Column(name = "idDetailFacture")
		private Long idDetailFacture;
        @Column(name="qte")
        private Integer qte;
        @Column(name="prixTotal")
        private float prixTotal;
        @Column(name="pourcentageRemise")
        private Integer pourcentageRemise;
        @Column(name="montantRemise")
        private Integer montantRemise;
        
        
       
       @ManyToOne
       Produit produit;
       
      
       @ManyToOne
       
       Facture facture;
		public Long getIdDetailFacture() {
			return idDetailFacture;
		}
		public void setIdDetailFacture(Long idDetailFacture) {
			this.idDetailFacture = idDetailFacture;
		}
		public Integer getQte() {
			return qte;
		}
		public void setQte(Integer qte) {
			this.qte = qte;
		}
		public float getPrixTotal() {
			return prixTotal;
		}
		public void setPrixTotal(float prixTotal) {
			this.prixTotal = prixTotal;
		}
		public Integer getPourcentageRemise() {
			return pourcentageRemise;
		}
		public void setPourcentageRemise(Integer pourcentageRemise) {
			this.pourcentageRemise = pourcentageRemise;
		}
		public Integer getMontantRemise() {
			return montantRemise;
		}
		public void setMontantRemise(Integer montantRemise) {
			this.montantRemise = montantRemise;
		}
		public DetailFacture(Long idDetailFacture, Integer qte, float prixTotal, Integer pourcentageRemise,
				Integer montantRemise) {
			super();
			this.idDetailFacture = idDetailFacture;
			this.qte = qte;
			this.prixTotal = prixTotal;
			this.pourcentageRemise = pourcentageRemise;
			this.montantRemise = montantRemise;
		}
		@Override
		public String toString() {
			return "DetailFacture [idDetailFacture=" + idDetailFacture + ", qte=" + qte + ", prixTotal=" + prixTotal
					+ ", pourcentageRemise=" + pourcentageRemise + ", montantRemise=" + montantRemise + "]";
		}
		public DetailFacture() {
			super();
			// TODO Auto-generated constructor stub
		}        
        
        
}