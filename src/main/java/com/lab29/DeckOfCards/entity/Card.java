package com.lab29.DeckOfCards.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {

	private String suit;
	private String value;
	private String image;
	
	public Card() {
		super();
	}

	public Card(String suit, String value, String image) {
		super();
		this.suit = suit;
		this.value = value;
		this.image = image;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", value=" + value + ", image=" + image + "]";
	}
	
	
}
