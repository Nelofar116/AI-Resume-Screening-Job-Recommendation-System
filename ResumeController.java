package com.example.demo.controller;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ResumeController {

    @PostMapping("/uploadResume")
    public String uploadResume(
            @RequestParam("file") MultipartFile file)
            throws IOException {

        String resumeText;

        try (PDDocument document = Loader.loadPDF(file.getBytes())) {
            PDFTextStripper stripper = new PDFTextStripper();
            resumeText = stripper.getText(document);
        }

        String skills = "";

        if (resumeText.toLowerCase().contains("java")) {
            skills += "java,";
        }

        if (resumeText.toLowerCase().contains("spring")) {
            skills += "spring,";
        }

        if (resumeText.toLowerCase().contains("sql")) {
            skills += "sql,";
        }

        if (resumeText.toLowerCase().contains("python")) {
            skills += "python,";
        }

        if (skills.endsWith(",")) {
            skills = skills.substring(0, skills.length() - 1);
        }

        return skills;
    }
}