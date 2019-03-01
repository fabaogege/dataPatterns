package dataPattem.adapter;
//这是测试类
public class Main {

	public static void main(String[] args) {
		//去外国旅游，只带了中国的接口
		ICNSocket_Adatpee cnsocket = new CNSocket();
		//在外国找了一个地方充电
		Foreign_client f  = new Foreign_client();
		//由于无法充电，所以拿出适配器来插入中国的接口
		SocketAdapter socketAdapter = new SocketAdapter(cnsocket);
		//然后插入外国地方的插座
		f.setSocket(socketAdapter);
		//充电
		f.charge();
	}

}
