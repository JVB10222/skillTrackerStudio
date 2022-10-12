package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String index(){
        return "<h1>Skills Tracker</h1>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>Javascript</li>" +
                    "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String createForm(){
        return "<form action='results' method='post'>" +
                    "<label>Name:<br /><input type='text' name='name'/></label><br />" +
                    "<label>My first language of choice<br />" +
                    "<select name=\"firstLang\" id=\"firstLang\">" +
                        "  <option value=\"java\">Java</option>" +
                        "  <option value=\"javascript\">Javascript</option>" +
                        "  <option value=\"ruby\">Ruby</option>" +
                    "</select></label><br />" +

                    "<label>My Second language of choice<br />" +
                    "<select name=\"secondLang\" id=\"secondLang\">" +
                    "  <option value=\"java\">Java</option>" +
                    "  <option value=\"javascript\">Javascript</option>" +
                    "  <option value=\"ruby\">Ruby</option>" +
                    "</select></label><br />" +

                    "<label>My Third language of choice<br />" +
                    "<select name=\"thirdLang\" id=\"thirdLang\">" +
                    "  <option value=\"java\">Java</option>" +
                    "  <option value=\"javascript\">Javascript</option>" +
                    "  <option value=\"ruby\">Ruby</option>" +
                    "</select></label><br />" +
                    "<input type='submit' value='Submit!'/>" +
                "</form>";
    }

    @PostMapping("/results")
    @ResponseBody
    public String respondToFormSubmission(@RequestParam String name
            ,@RequestParam String firstLang, @RequestParam String secondLang
            ,@RequestParam String thirdLang){
        return "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr><th>First Language</th><th>SecondLanguage</th><th>Third Language</th></tr>" +
                "<tr><td>" + firstLang + "</td><td>" + secondLang + "</td><td>" + thirdLang + "</td></tr>" +
                "</table>";

    }

}
