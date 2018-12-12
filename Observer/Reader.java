package designPatterns.Observer;
public class Reader implements Observer{
    private String name;
    private String messages;
    @Override
    public void update(String messages) {
        this.messages = messages;
        get();
    }
    public void get(){
        System.out.println(name+"收到消息:"+messages);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}