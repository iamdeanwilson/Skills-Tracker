package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {


    @GetMapping
    @ResponseBody
    @RequestMapping
    public String skills(){
        return "<html>" +
                "<body>" +
                "<H1>" +
                "Skills Tracker" +
                "</H1>" +
                "<H2>" +
                "We have a few skills we would like to learn. Here is the list!" +
                "</H2>" +
                "<OL>" +
                "<li>" +
                "Java" +
                "</li>" +
                "<li>" +
                "JavaScript" +
                "</li>" +
                "<li>" +
                "Python" +
                "</li>" +
                "</OL>" +
                "</body>" +
                "</html>";    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                    "<body>" +
                        "<form action='form' method = 'post'>" +
                            "<H3>" +
                                "Name: " +
                                "<input type = 'text' name = 'name' id=name>" +
                            "</H3>" +
                            "<label for=languages>My favorite language: </label>" +
                                "<select name=favoriteLanguage id=favoriteLanguage>" +
                                    "<option value=Java>Java</option>" +
                                    "<option value=JavaScript>JavaScript</option>" +
                                    "<option value=Python>Python</option>" +
                                "</select>" +
                            "<br></br>" +
                            "<label for=languages>My second favorite language: </label>" +
                                "<select name=secondFavoriteLanguage id=secondFavoriteLanguage>" +
                                     "<option value=JavaScript>JavaScript</option>" +
                                    "<option value=Java>Java</option>" +
                                    "<option value=Python>Python</option>" +
                            "</select>" +
                            "<br></br>" +
                            "<label for=languages>My third favorite language: </label>" +
                                "<select name=thirdFavoriteLanguage id=thirdFavoriteLanguage>" +
                                    "<option value=Python>Python</option>" +
                                    "<option value=Java>Java</option>" +
                                    "<option value=JavaScript>JavaScript</option>" +
                            "</select>" +
                            "<input type = 'submit' value = 'Submit' >" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String formSubmission(@RequestParam String name, String favoriteLanguage, String secondFavoriteLanguage, String thirdFavoriteLanguage){
        return "<h1>" + name + "</h1>" +
                "<OL>" +
                "<li>" +
                favoriteLanguage +
                "</li>" +
                "<li>" +
                secondFavoriteLanguage +
                "</li>" +
                "<li>" +
                thirdFavoriteLanguage +
                "</li>" +
                "</OL>";
    }

}
