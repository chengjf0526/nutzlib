package org.nutz.ioc;

public interface Ioc2 extends Ioc {

	/**
	 * ���Ǹ��߼��� Ioc ��ȡ����ķ����������� Ioc ����һ�������Ļ����� <br>
	 * �����Դ���Ϊ�ο���������ι������󣬻��߽����󻺴��ںδ�
	 * 
	 * @param type
	 *            ���������
	 * @param name
	 *            ���������
	 * @param context
	 *            ����������Ļ���
	 * @return ������
	 * 
	 * @see org.nutz.ioc.Ioc
	 */
	<T> T get(Class<T> type, String name, IocContext context);

}
