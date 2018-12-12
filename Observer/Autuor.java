package designPatterns.Observer;
import java.util.ArrayList;
public class Autuor implements Subject{
    private ArrayList observers;//被观察者集合,在构造器中创建
    private String messages;//通知的信息
    public Autuor(){
        observers = new ArrayList();
    }
    @Override
    //添加读者
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    //删除读者
    public void removeObserver(Observer o) {
        int i =observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    //遍历更新读者状态
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
          Observer observer  = (Observer) observers.get(i);
            observer.update(messages);
        }
    }
    public void setMessages(String s){
        this.messages =s;
        System.out.println("作者已更新");
        notifyObserver();

    }
}