package main.java.team.animal_games.state;

public interface State {
    public String getState();//获取state名的string形式

    public void showState();//输出state

    public int getStateToInt();//将state转化为对比赛有影响的int值

    public boolean isNil();//判断该种state是否为空对象
}
