package com.lab29.DeckOfCards;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.lab29.DeckOfCards.entity.Deck;
import com.lab29.DeckOfCards.entity.DrawCards;

@Controller
public class CardsController {
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView home() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Testing!");
		
		ResponseEntity<Deck> getDeck = rt.exchange("https://deckofcardsapi.com/api/deck/new/shuffle", HttpMethod.GET, 
				new HttpEntity<>("parameters", headers), Deck.class);
		
		//System.out.println(getDeck.getBody().isShuffled());
		
		String deckId = getDeck.getBody().getDeck_id();
		
		String drawCardUrl = "https://deckofcardsapi.com/api/deck/" + deckId + "/draw/?count=5";
		
		ResponseEntity<DrawCards> getCards = rt.exchange(drawCardUrl, HttpMethod.GET, 
				new HttpEntity<>("parameters", headers), DrawCards.class);
		
		System.out.println(getCards.getBody().getCards());
		
		
		return new ModelAndView("index", "drawcards", getCards.getBody().getCards());
	}
	

}
