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
@Table(name="Stock")
public class Stock implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@NotNull
    @Column(name = "idStock")
	private Long idStock;
	@Column (name="qteStock")
	private Integer qteStock;
	@Column (name="qteMin")
	private Integer qteMin;
	@ManyToOne
	Produit produit;
	
	
	public Long getIdStock() {
		return idStock;
	}
	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}
	public Integer getQteStock() {
		return qteStock;
	}
	public void setQteStock(Integer qteStock) {
		this.qteStock = qteStock;
	}
	public Integer getQteMin() {
		return qteMin;
	}
	public void setQteMin(Integer qteMin) {
		this.qteMin = qteMin;
	}
	public Stock(Long idStock, Integer qteStock, Integer qteMin) {
		super();
		this.idStock = idStock;
		this.qteStock = qteStock;
		this.qteMin = qteMin;
	}
	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", qteStock=" + qteStock + ", qteMin=" + qteMin + "]";
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
