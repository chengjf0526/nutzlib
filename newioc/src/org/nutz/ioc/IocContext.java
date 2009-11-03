package org.nutz.ioc;

/**
 * ����һ�ζ���װ��������Ļ����� ���� Ioc.get �����ö����������ź������ض�����
 * 
 * @author zozoh(zozohtnt@gmail.com)
 */
public interface IocContext {
	
	/**
	 * ����������һ�������Ķ���
	 * 
	 * @param context
	 */
	void linkTo(IocContext context);

	void save(String key, Object obj);

	Object fetch(String key);

}
