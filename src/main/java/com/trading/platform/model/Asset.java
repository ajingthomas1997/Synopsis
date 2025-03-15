package com.trading.platform.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double quantity;
    private double buyPrice;

    @ManyToOne
    private Coin coin;

   

    @ManyToOne
    private User user;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public double getQuantity() {
		return quantity;
	}



	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}



	public double getBuyPrice() {
		return buyPrice;
	}



	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}



	public Coin getCoin() {
		return coin;
	}



	public void setCoin(Coin coin) {
		this.coin = coin;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
    
    


}
