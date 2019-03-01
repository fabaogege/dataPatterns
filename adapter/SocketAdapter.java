package dataPattem.adapter;
//这是将中国充电器适配到外国的接口的方法
public class SocketAdapter implements IForeignSocket_Target{
		
		private ICNSocket_Adatpee cnSocket;
		//创建适配器的时候必须传入已有接口
		public SocketAdapter(ICNSocket_Adatpee cnsocket) {
			this.cnSocket = cnsocket;
		}
		//将现有接口适配到新的接口
		@Override
		public void foreignSocket() {
			cnSocket.CNSocket();
		}
}
