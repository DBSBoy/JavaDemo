package src.java.com.dbs.design.single;

public class SingleObject {
	//����һ��Ψһ�������instance
	private static SingleObject instance=new SingleObject();
	//private static SingleObject instance1=new SingleObject();
	//����ʵ�����Ĺ��캯��
	private SingleObject() {};
	//Ψһʵ����ȫ�ַ��ʵ�,Ψһ���ö���
	public static SingleObject getInstance(){
	      return instance;
	   }
	public void showMessage(){
	      System.out.println("Hello World!");
	   }
	
}
