package single;

public class SingleObject {
	//创建一个唯一对象，这个instance
	private static SingleObject instance=new SingleObject();
	//private static SingleObject instance1=new SingleObject();
	//不可实例化的构造函数
	private SingleObject() {};
	//唯一实例的全局访问点,唯一可用对象
	public static SingleObject getInstance(){
	      return instance;
	   }
	public void showMessage(){
	      System.out.println("Hello World!");
	   }
	
}
