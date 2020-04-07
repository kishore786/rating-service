package com.company.rating.controllers;



import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.company.rating.model.RatingDetails;
import com.company.rating.service.RatingService;

@RestController
public class RatingController {
  
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RatingService service;


    @GetMapping("/rating/{productId}/{reviewId}")
    public Optional<RatingDetails> getReviewDetails(@PathVariable Long productId, @PathVariable String reviewId) {
        return service.getRatingDetails(productId,reviewId);
    }

}
