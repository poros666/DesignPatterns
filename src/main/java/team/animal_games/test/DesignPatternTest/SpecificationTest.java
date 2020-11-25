package animal_games.test.DesignPatternTest;

import animal_games.rest.Food.*;
import animal_games.rest.specification.EnergyMoreThan;
import animal_games.rest.specification.FoodTypeIs;

import java.util.Scanner;

public class SpecificationTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Specification]Pattern —————————————-------------------------------------————");
        System.out.println("CompositeSpecification<T>:and(Specification<T> spec):规格模式的and函数，用于使用两个规格创建一个AndSpecification<>类");
        System.out.println("CompositeSpecification<T>:not():规格模式的not函数，用于使用当前的this的规格创建一个NotSpecification<>类");
        System.out.println("CompositeSpecification<T>:or(Specification<T> spec):规格模式的or函数，用于使用两个规格创建一个OrSpecification<>类");
        System.out.println("AndSpecification<T>:AndSpecification(Specification<T> left, Specification<T> right):" +
                "使用传入的两个Specification创建一个新的AndSpecification");
        System.out.println("AndSpecification<T>:isSatisfiedBy(T o):对于传入的o对象分别使用两个规格left,right进行判断，返回两个返回结果的做与操作的结果");
        System.out.println("OrSpecification<T>:OrSpecification(Specification<T> left, Specification<T> right):" +
                "使用传入的两个Specification创建一个新的OrSpecification");
        System.out.println("OrSpecification<T>:isSatisfiedBy(T o):对于传入的o对象分别使用两个规格left,tight进行判断，返回两个返回结果的做或操作的结果");
        System.out.println("NotSpecification<T>:NotSpecification(Specification<T> spec):" +
                "使用传入的Specification创建一个新的NotSpecification");
        System.out.println("NotSpecification<T>:isSatisfiedBy(T o):对于传入的o对象分别使用spec规格判断，返回其值的取反");
        System.out.println("EnergyMoreThan<T>:EnergyMoreThan(int i):EnergyMoreThan的创建函数，使用传入的int i来初始化需要比较的能量值");
        System.out.println("EnergyMoreThan<T>:isSatisfiedBy(T o):" +
                "取得Food对象的能量值，若能量大于设定值,则返回true，否则false");
        System.out.println("FoodTypeIs<T>:FoodTypeIs(FoodType foodType):FoodTypeIs的创建函数，使用传入的foodType来初始化需要比较的食物类型");
        System.out.println("FoodTypeIs<T>:isSatisfiedBy(T o):" +
                "取得Food对象的食物种类，若种类是相同,则返回true，否则false");
        System.out.println("");


        Food mealiePizza = new MealiePizzaFactory().createFood();
        System.out.println("MealiePizzaFactory创建出来的食物属性是："+mealiePizza.toString());
        FoodTypeIs<Food> foodTypeIsMeat = new FoodTypeIs<>(FoodType.meat);
        EnergyMoreThan<Food> energyMoreThan150 = new EnergyMoreThan<>(150);

        while(true){
            try {
                System.out.println("输入要使用的规格类型：1.能量大于150或者是肉类，2.能量大于150并且是肉类,3.不是肉类,输入其他数字则退出:" +
                        "(由于组合类型过多，这里给出几种选择，更多的规格选择和组合可以参照文档自行创建)");
                Scanner sc = new Scanner(System.in);
                int number=sc.nextInt();
                if(number==1){
                    if (foodTypeIsMeat.or(energyMoreThan150).isSatisfiedBy(mealiePizza)) {
                        System.out.println("食物是否是能量大于150或者是肉类，判断的结果是：true");
                    } else {
                        System.out.println("食物是否是能量大于150或者是肉类，判断的结果是：false");
                    }
                }
                else if(number==2){
                    if (foodTypeIsMeat.and(energyMoreThan150).isSatisfiedBy(mealiePizza)) {
                        System.out.println("食物是否是能量大于150并且是肉类，判断的结果是：true");
                    } else {
                        System.out.println("食物是否是能量大于150并且是肉类，判断的结果是：false");
                    }
                }
                else if(number==3){
                    if (foodTypeIsMeat.not().isSatisfiedBy(mealiePizza)) {
                        System.out.println("食物是否不是肉类，判断的结果是：true");
                    } else {
                        System.out.println("食物是否不是肉类，判断的结果是：false");
                    }
                }
                else {
                    break;
                }
            }catch (Exception e){
                System.out.println("输入数字无效，重新输入");
            }
        }



        System.out.println("");
        System.out.println("");
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}
