package main.java.team.animal_games.Animal.AbastractFactory;

import main.java.team.animal_games.Animal.Animal;

import java.util.Vector;

public abstract class AbstractFactory {
    protected String SeaAnimals_species;
    protected String LandAnimals_species;
    protected String SkyAnimals_species;

    public String getLandAnimals_species() {
        return LandAnimals_species;
    }

    public String getSeaAnimals_species() {
        return SeaAnimals_species;
    }

    public String getSkyAnimals_species() {
        return SkyAnimals_species;
    }

    protected Vector<Animal> SeaAnimals_warehouse;
    protected Vector<Animal> LandAnimals_warehouse;
    protected Vector<Animal> SkyAnimals_warehouse;
    
    public AbstractFactory(){
        /**
         * @description: create empty warehouse
         * @param: null
         * @return: null
         **/
        System.out.println("AbastractFactory: 默认构造函数： 创建三个空的动物仓库！");
        setSeaAnimals_warehouse(new Vector<Animal>());
        setLandAnimals_warehouse(new Vector<Animal>());
        setSkyAnimals_warehouse(new Vector<Animal>());
    }

    public AbstractFactory(Vector<Animal> seaAnimals_warehouse, Vector<Animal> landAnimals_warehouse, Vector<Animal> skyAnimals_warehouse){
        /**
         * @description: use previous ware_warehouse to create new warehouse
         * @param: three Animals' warehouse to create ProductFactory
         * @return: null
         */
        System.out.println("AbastractFactory: 以三个动物仓库为参数的构造函数： 将原来工厂中的动物仓库中的动物转移到当前工厂！");
        setSeaAnimals_warehouse(seaAnimals_warehouse);
        setLandAnimals_warehouse(landAnimals_warehouse);
        setSkyAnimals_warehouse(skyAnimals_warehouse);
    }

    public Vector<Animal> getSeaAnimals_warehouse() {
        return SeaAnimals_warehouse;
    }

    public void setSeaAnimals_warehouse(Vector<Animal> seaAnimals_warehouse) {
        SeaAnimals_warehouse = seaAnimals_warehouse;
    }

    public Vector<Animal> getLandAnimals_warehouse() {
        return LandAnimals_warehouse;
    }

    public void setLandAnimals_warehouse(Vector<Animal> landAnimals_warehouse) {
        LandAnimals_warehouse = landAnimals_warehouse;
    }

    public Vector<Animal> getSkyAnimals_warehouse() {
        return SkyAnimals_warehouse;
    }

    public void setSkyAnimals_warehouse(Vector<Animal> skyAnimals_warehouse) {
        SkyAnimals_warehouse = skyAnimals_warehouse;
    }

    /**
     * @description: abstract method to create animals
     * @param a string to select animal in RacingFactory
     * @return a animal created
     */
    public abstract Animal createSeaAnimals(String a);
    public abstract Animal createLandAnimals(String a);
    public abstract Animal createSkyAnimals(String a);

    /**
     * @description: print all animals in Animals' wareHouse
     */
    public void getWarehouse(){
        System.out.println("AbstractFactory: getWarehouse: 获取动物仓库中的动物种类！");
        System.out.println("===== SeaAnimal in " + this.toString() + " ==============");
        getSeaAnimals();
        System.out.println("===== LandAnimal in " + this.toString() + " ==============");
        getLandAnimals();
        System.out.println("===== SkyAnimal in " + this.toString() + " ==============");
        getSkyAnimals();
        System.out.println("");
    }
    private void getSeaAnimals(){
        for(Animal animal:SeaAnimals_warehouse){
            System.out.println(animal.toString());
        }
    }
    private void getLandAnimals(){
        for(Animal animal:LandAnimals_warehouse){
            System.out.println(animal.toString());
        }
    }
    private void getSkyAnimals(){
        for(Animal animal:SkyAnimals_warehouse){
            System.out.println(animal.toString());
        }
    }

    @Override
    public String toString() {
        return "abstract class ProductFactory";
    }
}
