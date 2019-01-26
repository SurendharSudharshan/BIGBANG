package model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pID;
	@Column(name="ProductName", length=10)

	private String pName;
	@Column(name="ProductCost")
	@Size(min=2, max=6, message="The prize should be between 2 digits to 4 digits")
	private String pCost;
	@Max(99)
	@Min(1)
	private int pQty;
	
	private Date pDOM;
	
	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCost() {
		return pCost;
	}

	public void setpCost(String pCost) {
		this.pCost = pCost;
	}

	public int getpQty() {
		return pQty;
	}

	public void setpQty(int pQty) {
		this.pQty = pQty;
	}

	public Date getpDOM() {
		return pDOM;
	}

	public void setpDOM(Date pDOM) {
		this.pDOM = pDOM;
	}
	public Product()
	{}

	public Product(int pID, @Pattern(regexp = "^[0-9]*") String pName,
			@Size(min = 2, max = 6, message = "The prize should be between 2 digits to 4 digits") String pCost,
			@Max(99) @Min(1) int pQty, @Future Date pDOM) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pCost = pCost;
		this.pQty = pQty;
		this.pDOM = pDOM;
	}
	
	
	
	

}
