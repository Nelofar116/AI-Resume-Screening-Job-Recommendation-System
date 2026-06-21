package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Recommendation;

@Service
public class RecommendationService {

    public List<Recommendation> getRecommendations(String skills) {

        List<Recommendation> recommendations =
                new ArrayList<>();

        skills = skills.toLowerCase();

        if (skills.contains("java")) {

            recommendations.add(
                new Recommendation(
                    "Java Developer",
                    "TCS",
                    "90%"));
        }

        if (skills.contains("spring")) {

            recommendations.add(
                new Recommendation(
                    "Spring Boot Developer",
                    "Deloitte",
                    "95%"));
        }

        if (skills.contains("sql")) {

            recommendations.add(
                new Recommendation(
                    "Backend Developer",
                    "Infosys",
                    "85%"));
        }

        return recommendations;
    }
}