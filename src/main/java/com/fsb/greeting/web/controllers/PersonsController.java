package com.fsb.greeting.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsb.greeting.web.models.Person;

import lombok.Locked.Read;

/* Carte d'opération CRUD
 * Read Get  /persons : Récuperer une liste de personne
 * 
 * Create - Get   /persons/create : Récupérer le formulaire d'ajout d'une nouvelle personne
 *        - Post  /persons/create : Ajouter une nouvelle personne à la liste persons
 * 
 * Update - Get   /persons/{id}/edit : Récupérer le formulaire de modificatin d'une personne
 *        - Post  /persons/{id}/edit : Mettre à jour une  personne de la liste persons
 * 
 * Delete - Post /persons/{id}/delete : Supprimer une personne de la liste persons par son id
 */

@Controller
public class PersonsController {

    private static List<Person> persons = new ArrayList<Person>();
    private static Long idCount = 0L;

    static {
        persons.add(new Person(++idCount, "demo1", (short) 20, "men.png"));
        persons.add(new Person(++idCount, "demo2", (short) 30, "women.png"));
        persons.add(new Person(++idCount, "demo3", (short) 40, null));
        persons.add(new Person(++idCount, "demo4", (short) 50, "men.png"));
    }
    
    //Read Get  /persons : Récuperer une liste de personne
    @RequestMapping("/persons")
    public String getAllPerson(Model model){
        model.addAttribute("persons", this.persons);
        return "person-list";
    } 
   //Create - Get   /persons/create : Récupérer le formulaire d'ajout d'une nouvelle personne
   @RequestMapping("/persons/create")
  public String getCreatePersonForm(Model model){
    
    return "add-person";
  }

   // @RequestMapping(path="/persons/create", method=RequestMethod.POST)



}