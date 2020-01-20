package course09_proxy.type.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {
	
	private Object targetObject;
	
	public Object newProxyInstance(Object targetObject) {
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��־��ʼ--------->");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Object ret = null;
		try {
			System.out.println("��ӡ��־----------------------------------");
//			System.out.println(proxy);
			ret = method.invoke(targetObject, args);
			System.out.println("�����ɹ�-----------------------------------");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("error----�쳣" + "\n" + e);
			throw e;
		}
		return ret;
	}
	
	
}
