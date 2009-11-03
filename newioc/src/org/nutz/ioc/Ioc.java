package org.nutz.ioc;

/**
 * Ioc �����ӿ�
 * 
 * @author zozoh(zozohtnt@gmail.com)
 */
public interface Ioc {

	/**
	 * �������л�ȡһ������ͬʱ�ᴥ������� fetch �¼��������һ�ι������� ����ȴ������� create �¼�
	 * 
	 * @param <T>
	 * @param type
	 *            ��������ͣ����Ϊ null���ڶ����ע�������У������������������
	 *            <br>�����Ϊnull����ע�����õ���������
	 * @param name
	 *            ���������
	 * @return ������
	 */
	<T> T get(Class<T> type, String name);

	/**
	 * �����Ƿ����ĳһ�ض�����
	 * 
	 * @param name
	 * @return
	 */
	boolean has(String name);
	
	
	/**
	 * @return �����������ж����˵Ķ��������б�
	 */
	String[] getName();

	/**
	 * �������ָ��ɳ�ʼ����״̬�����еĻ��涼�������
	 */
	void reset();

	/**
	 * ������ע������������� depose �¼�
	 */
	void depose();

}
