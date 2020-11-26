package main.java.team.animal_games.Animal.TransferObject;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.NullState;
import main.java.team.animal_games.state.StateExcited;
import main.java.team.animal_games.state.StateSick;
import main.java.team.animal_games.state.StateStarve;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AnimalBO {

    List<Animal> animals;

    public AnimalBO(){
        System.out.println("AnimalBO: AnimalBO(): create a database and add some data.");
        animals = new ArrayList<Animal>();
        Animal animal1 = new Animal(new NullState(),"tiger");
        Animal animal2 = new Animal(new NullState(),"lion");
        animals.add(animal1);
        animals.add(animal2);
    }

    public void deleteAnimals(String n){
        animals.remove(this.getAniaml(n));
    }

    public List<Animal> getAllAnimals(){
        System.out.println("AnimalBO: getAllAnimals(): get all animals' data in the DB.");
        return animals;
    }

    public Animal getAniaml(String n){
        System.out.println("AnimalBO: getAnimal(): get animal in DB by name.");
        for(Animal animal:animals){
            if(animal.getName().equals(n)){
                return animal;
            }
        }
        return null;
    }


    public void updateAnimal(Animal animal){
        System.out.println("AnimalBo: updateAnimal(): update animals' state");
        this.getAniaml(animal.getName()).setState(animal.getState());
        System.out.println("Animal: Name = "
                + animal.getName() +", updated in the database");
    }

    public void printAnimal(Animal an){
        System.out.print(this.getAllAnimals().indexOf(an)+" Animal :Name: " +
                an.getName() +
                "  State : [ ");
        if (NullState.class.equals(an.getState().getClass())) {
            System.out.print("Normal ]");
        } else if (StateExcited.class.equals(an.getState().getClass())) {
            System.out.print("Excited ]");
        } else if (StateSick.class.equals(an.getState().getClass())) {
            System.out.print("Sick ]");
        } else if (StateStarve.class.equals(an.getState().getClass())) {
            System.out.print("Starve ]");
        }
        System.out.print("  Attribute: [ \n");
        for (Map.Entry<String,Integer> entry:an.getAttribute().entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+"  ");
        }
        System.out.println("]\n");
    }
}
