package main.java.team.animal_games.equipment;

import java.util.HashMap;
import java.util.Map;

public class EquipmentRepository {
    private final Map<Long, EquipmentVersion> collection = new HashMap<>();
    public void add(EquipmentVersion version)
    {
        collection.put(version.getId(),version);
    }
    public void update(EquipmentVersion version) throws EquipmentNotFoundException,VersionMismatchException {
        if (!collection.containsKey(version.getId())) {
            throw new EquipmentNotFoundException("Not found Equipment with id: " + version.getId()+" owner: "+version.getUser()+" name: "+version.getName());
        }

        var latestEquipment = collection.get(version.getId());
        if (version.getVersion() != latestEquipment.getVersion()) {
            throw new VersionMismatchException(
                    "Tried to update stale version " + version.getVersion()
                            + " while actual version is " + latestEquipment.getVersion()
            );
        }

        version.setVersion(version.getVersion() + 1);

        collection.put(version.getId(), new EquipmentVersion(version));
    }

    public EquipmentVersion get(long equipmentId) throws EquipmentNotFoundException {
        if (!collection.containsKey(equipmentId)) {
            throw new EquipmentNotFoundException("Not found equipment with id: " + equipmentId);
        }

        return new EquipmentVersion(collection.get(equipmentId));
    }
}
