package com.lab29.DeckOfCards.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deck {
	
	private int remaining;
	private boolean shuffled;
	private String deck_id;
	
	public Deck() {
		super();
	}

	public Deck(int remaining, boolean shuffled, String deck_id) {
		super();
		this.remaining = remaining;
		this.shuffled = shuffled;
		this.deck_id = deck_id;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	public boolean isShuffled() {
		return shuffled;
	}

	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}

	public String getDeck_id() {
		return deck_id;
	}

	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}

	@Override
	public String toString() {
		return "Deck [remaining=" + remaining + ", shuffled=" + shuffled + ", deck_id=" + deck_id + "]";
	}
	
	

}
