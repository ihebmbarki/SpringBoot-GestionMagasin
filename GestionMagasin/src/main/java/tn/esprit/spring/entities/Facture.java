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
@Table (name="Facture")
public class Facture implements Serializable{
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@NotNull
	    @Column(name = "idFacture")
		private Long idFacture;
        @Column(name="montantRemise")
        private float montantRemise;
        @Column(name="montantFacture")
        private float montantFacture;
		@Temporal (TemporalType.DATE)
		private Date dateFacture;
		@Column(name="active")
		private Boolean active;
		
		@OneToMany(mappedBy="facture")
		private Set<Client> client;
		@OneToMany(mappedBy="facture")
		private Set<DetailFacture> detailFacture;
		
	
		public Long getIdFacture() {
			return idFacture;
		}
		public void setIdFacture(Long idFacture) {
			this.idFacture = idFacture;
		}
		public float getMontantRemise() {
			return montantRemise;
		}
		public void setMontantRemise(float montantRemise) {
			this.montantRemise = montantRemise;
		}
		public float getMontantFacture() {
			return montantFacture;
		}
		public void setMontantFacture(float montantFacture) {
			this.montantFacture = montantFacture;
		}
		public Date getDateFacture() {
			return dateFacture;
		}
		public void setDateFacture(Date dateFacture) {
			this.dateFacture = dateFacture;
		}
		public Boolean getActive() {
			return active;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		public Facture(Long idFacture, float montantRemise, float montantFacture, Date dateFacture, Boolean active) {
			super();
			this.idFacture = idFacture;
			this.montantRemise = montantRemise;
			this.montantFacture = montantFacture;
			this.dateFacture = dateFacture;
			this.active = active;
		}
		@Override
		public String toString() {
			return "Facture [idFacture=" + idFacture + ", montantRemise=" + montantRemise + ", montantFacture="
					+ montantFacture + ", dateFacture=" + dateFacture + ", active=" + active + "]";
		}
		public Facture() {
			super();
			// TODO Auto-generated constructor stub
		}
		
        
        
        
        
        
}