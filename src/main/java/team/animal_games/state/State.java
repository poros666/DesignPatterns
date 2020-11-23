//author: Lei chen
package main.java.team.animal_games.state;


public abstract class State {//抽象类state，用各种state类实现
    protected String state;

    abstract public String getState();//获取state名的string形式

    abstract public void showState();//输出state

    abstract public int getStateToInt();//将state转化为对比赛有影响的int值

    abstract public boolean isNil();//判断该种state是否为空对象
}
