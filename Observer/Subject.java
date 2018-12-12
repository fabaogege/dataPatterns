package designPatterns.Observer;
/*
* 场景介绍：一论坛作者有许多关注他的读者，若作者更新文章，则关注他的读者会收到通知
* */
/**
 * 主题（被观察者）接口
 * 定义 添加，删除，通知观察者的方法
 */
public interface Subject {
    public void registerObserver(Observer object);
    public void removeObserver(Observer object);
    public void notifyObserver();
}
