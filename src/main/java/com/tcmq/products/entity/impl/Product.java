package com.tcmq.products.entity.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tcmq.products.entity.BaseEntity;

@Entity
@Table(name = "product")
public class Product extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="name")
	private String name;
	
	@Column(name="categoryId")
	private Category category;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private float price;
	
	@OneToMany(mappedBy = "product")
	private List<ImgProduct> imgProducts;
	
	private boolean status;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<ImgProduct> getImgProducts() {
		return imgProducts;
	}

	public void setImgProducts(List<ImgProduct> imgProducts) {
		this.imgProducts = imgProducts;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
