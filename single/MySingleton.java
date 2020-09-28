package single;

public class MySingleton {
	//volatile关键字保证对MySingleton对象的操作在不同的线程之间具有可见性，在一个线程修改变量的
	//的同时，另外的变量也在修改的话，其中一个会被强制修改无效，直到另一个修改完成
	private  static  volatile  MySingleton instanceMySingleton=null;
	   private  MySingleton() {}
	   
	   public  static MySingleton  getInstanceMySingleton()
	   {
		   if(instanceMySingleton!=null) {
			   
		   }else {
			   //双重校验
			   if(instanceMySingleton==null) {
				   synchronized (MySingleton.class) {
					   
					if(instanceMySingleton==null) {
						instanceMySingleton=new MySingleton();
					}
				}
			   }
		   }
		   return instanceMySingleton;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=0;i<5;i++)  {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("888:"+MySingleton.getInstanceMySingleton().hashCode());
						
					}
				}).start();
				 }
	}

}
