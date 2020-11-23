package animal_games.rest.specification;

/**
 * @className: EnergyMoreThan
 * @package animal_games.rest.specification
 * @description: the concrete class that judge the food's energy is larger than this.energy or not
 * @author: Dandelion
 * @date: 2020-11-19 19:48
 * @version: V1.0
 */
public class EnergyMoreThan<T> extends CompositeSpecification<T> {

    private final int energy;

    /**
     * @className: EnergyMoreThan
     * @description: set the energy number
     * @param: [i]
     */
    public EnergyMoreThan(int i) {
        System.out.println("EnergyMoreThan<T>:EnergyMoreThan(int i):EnergyMoreThan的创建函数，使用传入的int i来初始化需要比较的能量值,i 是"+i);
        this.energy = i;
    }

    /**
     * @methodName: isSatisfiedBy
     * @description: in class food we override the method toString now it can return "type,energy" we use the second part to compare with this.energy
     * @param: [o]
     * @return: boolean
     * @throws:
     */
    @Override
    public boolean isSatisfiedBy(T o) {
        System.out.println("EnergyMoreThan<T>:isSatisfiedBy(T o):" +
                "取得Food对象的能量值，若能量大于"+this.energy+",则返回true，否则false");
        String[] str = o.toString().split(",");
        return Integer.parseInt(str[1]) > energy;
    }
}
