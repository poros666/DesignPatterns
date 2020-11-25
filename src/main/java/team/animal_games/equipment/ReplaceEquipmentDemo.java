package main.java.team.animal_games.equipment;

public class ReplaceEquipmentDemo {
    private static final String kind[] =
            {  "aircraft","barbell", "basketball", "clothes", "helmet", "shoe" };
    public static void main(String[] args) throws Exception{
        EquipmentRepository equipmentRepository = new EquipmentRepository();

        long slotId = 1;
        int n = (int) (Math.random() * 100 % 6);

        GetEquipment equipments = new GetEquipment();
        equipments.getEquipment(kind[n]);
        User cat = new User("Cat");
        EquipmentVersion first=new EquipmentVersion(slotId,equipments.getKind(),"Cat",equipments.getValue(),equipments.getPrice(),1);
        equipmentRepository.add(first);
        final EquipmentVersion firstValue = equipmentRepository.get(slotId);
        final EquipmentVersion SecondValue = equipmentRepository.get(slotId);
        firstValue.setName(equipments.getKind());
        equipmentRepository.update(firstValue);
        System.out.println("The value is updated with new version:" + firstValue.getVersion());

        SecondValue.setUser("Cat");
        try {
            System.out.println("Tries to update with old version: " + SecondValue.getVersion());
            equipmentRepository.update(SecondValue);
        } catch (VersionMismatchException e) {

            System.out.println("Exception: "+ e.getMessage());

        }
        cat.giveEquipment(equipments.getKind());
    }
}
