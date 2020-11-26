package main.java.team.animal_games.Animal.AbastractFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestAbsFactory {
    private enum FactoryKind  {dummy, Lifting, Racing};

    static FactoryKind factoryKind = FactoryKind.dummy;
    static AbstractFactory abstractFactory = null;

    public static void TestSpecies(){
        System.out.println("@@ 工厂当前生产的产品是: ");
        System.out.println(abstractFactory.SeaAnimals_species);
        System.out.println(abstractFactory.LandAnimals_species);
        System.out.println(abstractFactory.SkyAnimals_species+'\n');
    }
    public static void TestProduct(FactoryKind op){
        switch (op){
            case Lifting:{
                abstractFactory.createSeaAnimals("a");
                abstractFactory.createLandAnimals("a");
                abstractFactory.createSkyAnimals("a");
                break;
            }
            case Racing:{
                abstractFactory.createSeaAnimals("shark");
                abstractFactory.createLandAnimals("lion");
                abstractFactory.createSkyAnimals("eagle");
                abstractFactory.createSeaAnimals("whale");
                abstractFactory.createLandAnimals("horse");
                abstractFactory.createSkyAnimals("seagull");
                break;
            }
        }
    }

    public static void TestOutputWarehouse(){
        abstractFactory.getWarehouse();
    }

    public static void switchAnimalWarehouse(FactoryKind op){
        boolean empty_flag=factoryKind.equals(FactoryKind.dummy);
        boolean equal_flag=factoryKind.equals(op);

        if(empty_flag || !equal_flag){
            switch (op){
                case Lifting:
                    abstractFactory = (empty_flag || equal_flag)?(new LiftingFactory()):
                            (new LiftingFactory(abstractFactory.getSeaAnimals_warehouse(), abstractFactory.getLandAnimals_warehouse(), abstractFactory.getSkyAnimals_warehouse()));
                    factoryKind = FactoryKind.Lifting;
                    break;
                case Racing:
                    abstractFactory = (empty_flag || equal_flag)?(new RacingFactory()):
                            (new RacingFactory(abstractFactory.getSeaAnimals_warehouse(), abstractFactory.getLandAnimals_warehouse(), abstractFactory.getSkyAnimals_warehouse()));
                    factoryKind = FactoryKind.Racing;
                    break;
                default:break;
            }
        }
    }

    public static void main(String[] arg){
        /*RacingFactory racingFactory= new RacingFactory();
        LiftingFactory liftingFactory = new LiftingFactory();
        System.out.println(liftingFactory.createLandAnimals("horse").toString());*/
        System.out.println("—————————————-------------------------------------———— Test[Abstract Factory]Pattern —————————————-------------------------------------————");
        System.out.println("Follow are (classname: methods: action)！"+'\n');

        System.out.println("AbastractFactory: 默认构造函数： 创建三个空的动物仓库！");
        System.out.println("AbastractFactory: 以三个动物仓库为参数的构造函数： 将原来工厂中的动物仓库中的动物转移到当前工厂！");
        System.out.println("AbstractFactory: getWarehouse: 获取动物仓库中的动物种类！");
        System.out.println("LiftingFactory: createSeaAnimals: add a SeaAnimal to SeaAnimals_warehouse");
        System.out.println("LiftingFactory: createLandAnimals: add a LandAnimal to LandAnimals_warehouse");
        System.out.println("LiftingFactory: createSkyAnimals: add a SkyAnimal to SkyAnimals_warehouse");
        System.out.println("LiftingFactory: createSeaAnimals: add a SeaAnimal to SeaAnimals_warehouse");
        System.out.println("LiftingFactory: createLandAnimals: add a LandAnimal to LandAnimals_warehouse");
        System.out.println("LiftingFactory: createSkyAnimals: add a SkyAnimal to SkyAnimals_warehouse"+'\n');

        Scanner scanner = new Scanner(System.in);
        FactoryKind opcode;

        boolean cont = true;

        do{
            System.out.println("请选择动物工厂|1 LiftingFactory|2 RacingFactory| 0");

            try{
                int i =Integer.parseInt(scanner.nextLine());
                opcode = FactoryKind.values()[i];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("错误输入，请重新选择");
                System.out.println("");
                continue;
            }catch (InputMismatchException e2){
                System.out.println("错误输入，请重新选择");
                System.out.println("");
                continue;
            }catch (NumberFormatException e3)
            {
                System.out.println("错误输入，请重新选择");
                System.out.println("");
                continue;
            }

            if(opcode == FactoryKind.dummy) {
                cont= false;
            }
            else {
                switchAnimalWarehouse(opcode);
                TestSpecies();
                TestProduct(opcode);
                TestOutputWarehouse();
            }
        }while (cont);

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
