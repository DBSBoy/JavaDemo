package src.java.com.dbs.design.single;

public class MySingleton {
	//volatile�ؼ��ֱ�֤��MySingleton����Ĳ����ڲ�ͬ���߳�֮����пɼ��ԣ���һ���߳��޸ı�����
	//��ͬʱ������ı���Ҳ���޸ĵĻ�������һ���ᱻǿ���޸���Ч��ֱ����һ���޸����
	private  static  volatile  MySingleton instanceMySingleton=null;
	   private  MySingleton() {}
	   
	   public  static MySingleton  getInstanceMySingleton()
	   {
		   if(instanceMySingleton!=null) {
			   
		   }else {
			   //˫��У��
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
