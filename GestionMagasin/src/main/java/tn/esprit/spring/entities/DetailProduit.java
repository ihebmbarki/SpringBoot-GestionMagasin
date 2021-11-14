package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

@Entity
@Table (name="DetailProduit")
public class DetailProduit implements Serializable{
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@NotNull
	    @Column(name = "idDetailProduit")
		private Long DetailProduit;
		
		@Temporal (TemporalType.DATE)
		private Date dateCreation;
		
		@Temporal (TemporalType.DATE)
		private Date dateDerniereModification;
		
		@Column(name="categorieProduit")
		private CategorieProduit categorieProduit;
		
		@OneToOne (mappedBy="detailProduit")
		private Produit produit;
		

		public Long getDetailProduit() {
			return DetailProduit;
		}

		public void setDetailProduit(Long detailProduit) {
			DetailProduit = detailProduit;
		}

		public Date getDateCreation() {
			return dateCreation;
		}

		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}

		public Date getDateDerniereModification() {
			return dateDerniereModification;
		}

		public void setDateDerniereModification(Date dateDerniereModification) {
			this.dateDerniereModification = dateDerniereModification;
		}

		public CategorieProduit getCategorieProduit() {
			return categorieProduit;
		}

		public void setCategorieProduit(CategorieProduit categorieProduit) {
			this.categorieProduit = categorieProduit;
		}

		

		@Override
		public String toString() {
			return "DetailProduit [DetailProduit=" + DetailProduit + ", dateCreation=" + dateCreation
					+ ", dateDerniereModification=" + dateDerniereModification + ", categorieProduit="
					+ categorieProduit + "]";
		}

		public DetailProduit(Long detailProduit, Date dateCreation, Date dateDerniereModification,
				CategorieProduit categorieProduit) {
			super();
			DetailProduit = detailProduit;
			this.dateCreation = dateCreation;
			this.dateDerniereModification = dateDerniereModification;
			this.categorieProduit = categorieProduit;
			
		}

		public DetailProduit() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
