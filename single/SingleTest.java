package single;

public class SingleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//不可new一个对象了，我只能获取一个在SingleObject已经定义好的唯一对象，自己不能在其他类定义了
		SingleObject object = SingleObject.getInstance();
		 
	      //显示消息
	      object.showMessage();
	}

}
