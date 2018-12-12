package designPatterns.Observer;

public class Test {
    public static  void main(String[] args){
        Autuor autuor = new Autuor();
        Observer reader1 = new Reader();
        Observer reader2 = new Reader();
        Observer reader3 = new Reader();
        ((Reader)reader1).setName("1号读者");
        ((Reader)reader2).setName("2号读者");
        ((Reader)reader3).setName("3号读者");
        //已关注的读者
        autuor.registerObserver(reader1);
        autuor.registerObserver(reader2);
        autuor.registerObserver(reader3);
        //作者更新
        autuor.setMessages("更新章节啦");
        //1号读者取消了关注
        autuor.removeObserver(reader1);
        autuor.setMessages("又更新章节啦");
    }
}