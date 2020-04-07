package com.company.rating.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.company.rating.model.RatingDetails;

@Service
public class RatingService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public Optional<RatingDetails> getRatingDetails(Long productId, String reviewId) {
		RatingDetails rating= new RatingDetails();
		
		if("v1".equalsIgnoreCase(reviewId)) {
			rating.setComment("Version 1: No review");
			rating.setRating("NA");
		}else if("v2".equalsIgnoreCase(reviewId)) {
			rating.setComment("Version 2: Excellent product");
			rating.setRating("Black");
		}else if("v3".equalsIgnoreCase(reviewId)) {
			rating.setComment("Version 3: Good product");
			rating.setRating("Red");
		}		
				
		Optional<RatingDetails>  optional =  Optional.of(rating);
		
		return optional;
	}
	
}
