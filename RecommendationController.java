package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Recommendation;
import com.example.demo.service.RecommendationService;

@RestController
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/recommend")
    public List<Recommendation> recommendJobs(
            @RequestParam String skills) {

        return recommendationService
                .getRecommendations(skills);
    }
}