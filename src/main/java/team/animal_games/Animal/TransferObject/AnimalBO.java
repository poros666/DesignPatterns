package main.java.team.animal_games.Animal.TransferObject;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.NullState;
import main.java.team.animal_games.state.StateExcited;
import main.java.team.animal_games.state.StateSick;
import main.java.team.animal_games.state.StateStarve;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnimalBO {

    List<Animal> animals;

    /**
     * @description: 无参构造函数，初始化数据库并加入初始数据
     */
    public AnimalBO(){
        System.out.println("AnimalBO: AnimalBO(): create a database and add some data.");
        animals = new ArrayList<Animal>();
        Animal animal1 = new Animal(new NullState(),"tiger");
        Animal animal2 = new Animal(new NullState(),"lion");
        animals.add(animal1);
        animals.add(animal2);
    }

    /**
     * @description: delete a animal from list by its name
     * @param n animal's name to delete
     */
    public void deleteAnimals(String n){
        animals.remove(this.getAnimal(n));
    }

    /**
     * @description:  get all animals in list
     * @return return all animals in list
     */
    public List<Animal> getAllAnimals(){
        System.out.println("AnimalBO: getAllAnimals(): get all animals' data in the DB.");
        return animals;
    }

    /**
     * @description: find animal in list by his name
     * @param n animal's name
     * @return a animal object
     */
    public Animal getAnimal(String n){
        System.out.println("AnimalBO: getAnimal(): get animal in DB by name.");
        for(Animal animal:animals){
            if(animal.getName().equals(n)){
                return animal;
            }
        }
        return null;
    }

    /**
     * @description: modify animal's state by using a animal having same name
     * @param animal a animal instance to update list
     */
    public void updateAnimal(Animal animal){
        System.out.println("AnimalBo: updateAnimal(): update animals' state");
        this.getAnimal(animal.getName()).setState(animal.getState());
        System.out.println("Animal: Name = "
                + animal.getName() +", updated in the database");
    }

    /**
     * @description: to print a animal's all information
     * @param an a animal instance
     */
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
