package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String skillsTracker(){
        String html = "<html> + <body>" +
                      "<h1>Skills Tracker</h1>"+
                      "<h2>Skills to learn</h2><ol>"+
                      "<li>Java</li>"+
                      "<li>JavaScript</li>"+
                      "<li>TypeScript</li></ol></body></html>";
        return html;
    }
    @RequestMapping("form")
    @ResponseBody
    public String skillsTrackerForm(){
        String html = "<html> + <body>" +
                "<h1>Skills Tracker</h1>"+
                "<h2>Skills to learn</h2>"+
                "<form method='POST' action='/success'>"+

                "<label for='username'>Enter your name</label>"+
                "<input type='text' name='username'/></input><hr>"+

                "<label for='firstLanguage'>Choose a skill:</label>"+
                "<select name='firstLanguage'>" +
                "<option>Java</option>"+
                "<option>JavaScript</option>"+
                "<option>TypeScript</option>"+
                "</select><br>"+

                "<label for='secondLanguage'>Choose a second skill:</label>"+
                "<select name='secondLanguage'>" +
                "<option>Java</option>"+
                "<option>JavaScript</option>"+
                "<option>TypeScript</option>"+
                "</select><br>"+

                "<label for='thirdLanguage'>Choose the last skill:</label>"+
                "<select name='thirdLanguage'>" +
                "<option>Java</option>"+
                "<option>JavaScript</option>"+
                "<option>TypeScript</option>"+
                "</select><br>"+

                "<input type='submit' value='Show me the skills!'/><br>"+
                "</form></body></html>";

        return html;
    }
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="success")
    @ResponseBody
    public String skillsTrackerSuccess(@RequestParam String username, @RequestParam String firstLanguage, @RequestParam String secondLanguage, String thirdLanguage){
        String html = "<html> + <body>" +
                "<h1>Skills Tracker for " + username + "</h1>"+
                "<h2>Skills to learn</h2><ol>"+
                "<li>" + firstLanguage + "</li>"+
                "<li>" + secondLanguage +"</li>"+
                "<li>" + thirdLanguage+ "</li></ol></body></html>";
        return html;
    }
}
