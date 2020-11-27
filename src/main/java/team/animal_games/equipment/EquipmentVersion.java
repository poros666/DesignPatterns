package main.java.team.animal_games.equipment;

public class EquipmentVersion {
    private long id;
    private String name = "";
    private String user = "";
    private int value = 0;
    private int price = 0;

    private long version = 0; // version number
    public EquipmentVersion(long id,String name,String user,int value,int price,int version) {
        /**
         * @description: initial objects
         *
         **/
        this.id = id;
        this.value = value;
        this.price = price;
        this.user = user;
        this.name = name;
        this.version = version;
    }

    public EquipmentVersion(EquipmentVersion version) {
        /**
         * @description: initial objects
         *
         **/
        this.id = version.id;
        this.value = version.value;
        this.price = version.price;
        this.user = version.user;
        this.name = version.name;
        this.version = version.version;
    }

    public long getId() {
       return this.id;
    }
    /**
     * @description: return id
     *
     **/

    public String getName() {
        return name;
    }
    /**
     * @description: return name
     *
     **/

    public String getUser() {
        return user;
    }
    /**
     * @description: return user
     *
     **/

    public int getValue() {
        return value;
    }
    /**
     * @description: return value
     *
     **/

    public int getPrice() {
        return price;
    }
    /**
     * @description: return price
     *
     **/

    public long getVersion() {
        return version;
    }
    /**
     * @description: return version
     *
     **/

    public void setId(long id) {
        this.id = id;
    }
    /**
     * @description: return id
     *
     **/

    public void setName(String name) {
        this.name = name;
    }
    /**
     * @description: set name
     *
     **/

    public void setUser(String user) {
        this.user = user;
    }
    /**
     * @description: set user
     *
     **/

    public void setValue(int value) {
        this.value = value;
    }
    /**
     * @description: set value
     *
     **/

    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * @description: set price
     *
     **/

    public void setVersion(long version) {
        this.version = version;
    }
    /**
     * @description: set version
     *
     **/
}
