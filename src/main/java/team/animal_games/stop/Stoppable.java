package main.java.team.animal_games.stop;

//此处使用了marker interface设计模式，可以用来标记当前角色是否具有中指比赛的权利
//如果需要有这个权利则实现该接口即可
//如果需要检测是否具有该权限则只需要使用instanceof关键词即可
public interface Stoppable {
}
