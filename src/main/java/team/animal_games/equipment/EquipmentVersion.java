package main.java.team.animal_games.equipment;

public class EquipmentVersion {
    private long id;
    private String name = "";
    private String user = "";
    private int value = 0;
    private int price = 0;

    private long version = 0; // version number
    public EquipmentVersion(long id,String name,String user,int value,int price,int version) {
        this.id = id;
        this.value = value;
        this.price = price;
        this.user = user;
        this.name = name;
        this.version = version;
    }

    public EquipmentVersion(EquipmentVersion version) {
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

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public int getValue() {
        return value;
    }

    public int getPrice() {
        return price;
    }

    public long getVersion() {
        return version;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
