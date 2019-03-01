package dataPattem.adapter;
/**
 * 这是外国的地方，里面有外国的插座接口。
 * @author lzp
 *
 */
public class Foreign_client{
	//该地方里面有插座接口
	private IForeignSocket_Target socket;
	public Foreign_client() {}
	//该地方的插座插入充电器
	public void setSocket(IForeignSocket_Target socket) {
		this.socket =socket;
	}
	//充电功能
	public void charge() {
		socket.foreignSocket();
	}
}
