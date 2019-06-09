package com.lab29.DeckOfCards.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DrawCards {

	private int remaining;
	private ArrayList<Card> card;
	
	public DrawCards() {
		super();
	}

	public DrawCards(int remaining, ArrayList<Card> card) {
		super();
		this.remaining = remaining;
		this.card = card;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public ArrayList<Card> getCards() {
		return card;
	}

	public void setCards(ArrayList<Card> card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "DrawCards [remaining=" + remaining + ", card=" + card + "]";
	}
	
	
	
}
