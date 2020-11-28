package main.java.team.animal_games.test;


import main.java.team.animal_games.test.DesignPatternTest.*;

import java.util.Scanner;

/**
 * @ClassName TestAll
 * @Description //Single interface of all design patterns`test
 * @Author poros
 * @Date 2020/11/27 20:24
 **/
public class TestAll {
    public static void main(String[] args) throws Exception {
        Scanner in1 = new Scanner(System.in);
        int num = -1;
        do {
            System.out.println("===============================ALL DP===============================");
            System.out.println("=                      1 Template Method                           =");
            System.out.println("=                      2 Facade                                    =");
            System.out.println("=                      3 Observer  Pattern                         =");
            System.out.println("=                      4 Singleton  Pattern                        =");
            System.out.println("=                      5 Marker Interface pattern                  =");
            System.out.println("=                      6 Prototype Pattern                         =");
            System.out.println("=                      7 Flyweight Pattern                         =");
            System.out.println("=                      8 Mediator Pattern                          =");
            System.out.println("=                      9 Version Number                            =");
            System.out.println("=                      10 Abstract  Factory                        =");
            System.out.println("=                      11 Builder                                  =");
            System.out.println("=                      12 Adapter                                  =");
            System.out.println("=                      13 State                                    =");
            System.out.println("=                      14 Visitor                                  =");
            System.out.println("=                      15 Null Object                              =");
            System.out.println("=                      16 Strategy Pattern                         =");
            System.out.println("=                      17 Memento                                  =");
            System.out.println("=                      18 COW（CopyOnWrite）                        =");
            System.out.println("=                      19 Reference Count                          =");
            System.out.println("=                      20 Sharable                                 =");
            System.out.println("=                      21 Bridge                                   =");
            System.out.println("=                      22 Factory Method                           =");
            System.out.println("=                      23 Specification Pattern                    =");
            System.out.println("=                      24 Criteria Pattern                         =");
            System.out.println("=                      25 Interpreter                              =");
            System.out.println("=                      26 TransferObject  Pattern                  =");
            System.out.println("=                      27 proxy                                    =");
            System.out.println("=                      28 command                                  =");
            System.out.println("=                      29 chain of responsibilities                =");
            System.out.println("=                      30 Decorator                                =");
            System.out.println("=                      31 Composite                                =");
            System.out.println("=                      32 Iterator                                 =");
            System.out.println("=                      33 Business Delegate Pattern                =");
            System.out.println("=                       0 EXIT TEST                                =");
            System.out.println("=========================Chose you action!==========================");
            if (in1.hasNextInt()) {
                num = in1.nextInt();
            }
            switch (num) {
                case 0:
                    break;
                case 1:
                    TemplateMethodTest.main(new String[]{});
                    break;
                case 2:
                    FacadeTest.main(new String[]{});
                    break;
                case 3:
                    ObserverTest.main(new String[]{});
                    break;
                case 4:
                    SingletonTest.main(new String[]{});
                    break;
                case 5:
                    MarkerInterfaceTest.main(new String[]{});
                    break;
                case 6:
                    PrototypeTest.main(new String[]{});
                    break;
                case 7:
                    FlyweightTest.main(new String[]{});
                    break;
                case 8:
                    MediatorTest.main(new String[]{});
                    break;
                case 9:
                    VersionNumberTest.main(new String[]{});
                    break;
                case 10:
                    TestAbsFactory.main(new String[]{});
                    break;
                case 11:
                    TestBuilder.main(new String[]{});
                    break;
                case 12:
                    TestAdapter.main(new String[]{});
                    break;
                case 13:
                    StateTest.main(new String[]{});
                    break;
                case 14:
                    VisitorTest.main(new String[]{});
                    break;
                case 15:
                    NullObjectTest.main(new String[]{});
                    break;
                case 26:
                    TestTransferObject.main(new String[]{});
                    break;
                case 31:
                    CompositeTest.main(new String[]{});
                case 32:
                    IteratorTest.main(new String[]{});
                case 33:
                    BusinessDelegatePatternTest.main(new String[]{});
                default:
                    break;
            }
        } while (num != 0);


    }
}
