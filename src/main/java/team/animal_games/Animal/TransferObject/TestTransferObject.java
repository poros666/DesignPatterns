package main.java.team.animal_games.Animal.TransferObject;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.NullState;
import main.java.team.animal_games.state.StateExcited;
import main.java.team.animal_games.state.StateSick;
import main.java.team.animal_games.state.StateStarve;

import java.util.Map;
import java.util.Scanner;

public class TestTransferObject {
    public static void main(String[] arg){
        AnimalBO animalBO = new AnimalBO();

        System.out.println("—————————————-------------------------------------———— Test[Transfer Object]Pattern —————————————-------------------------------------————");
        System.out.println("Follow are (classname: methods: action)！"+'\n');

        System.out.println("AnimalBO: AnimalBO(): create a database and add some data.");
        System.out.println("AnimalBO: getAllAnimals(): get all animals' data in the DB.");
        System.out.println("AnimalBO: getAnimal(): get animal in DB by name.");
        System.out.println("AnimalBo: updateAnimal(): update animals' state\n");

        //输出所有动物
        for (Animal animal : animalBO.getAllAnimals()){
            animalBO.printAnimal(animal);
        }

        //更新动物
        Scanner reader = new Scanner(System.in);
        System.out.println("----------------now let update animals---------------");
        System.out.println("--------------choose the index of Animal-------------");
        int index = reader.nextInt();
        Animal temp = animalBO.getAllAnimals().get(index);
        System.out.println("state:1 normal|2 excited|3 sick|4 starve");
        int state = reader.nextInt();
        switch (state){
            case 1:
                temp.setState(new NullState());
                break;
            case 2:
                temp.setState(new StateExcited());
                break;
            case 3:
                temp.setState(new StateSick());
                break;
            case 4:
                temp.setState(new StateStarve());
                break;
            default:break;
        }
        animalBO.updateAnimal(temp);

        //获取动物
        System.out.println("-----------------now let get animal-----------------");
        System.out.println("---------------input the name of Animal-------------");
        String na = reader.next();
        Animal animal = animalBO.getAniaml(na);
        animalBO.printAnimal(animal);

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
