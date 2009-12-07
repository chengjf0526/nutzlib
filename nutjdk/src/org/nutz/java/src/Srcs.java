package org.nutz.java.src;

import java.util.ArrayList;
import java.util.List;

import org.nutz.java.exception.ElementExistsException;

public class Srcs {

	static <T> List<T> list(Class<T> classOfT) {
		return new ArrayList<T>();
	}

	/**
	 * ȷ��ĳһ�� Java Ԫ�ؼ���û��ĳһ��Ԫ��
	 * 
	 * @param list
	 *            ����
	 * @param je
	 *            Ԫ��
	 * @throws ElementExistsException
	 *             ����Ѵ��ڣ��׳����쳣
	 */
	static void assertNoExists(List<? extends JavaElement> list, JavaElement je)
			throws ElementExistsException {
		if (null == list || list.size() == 0)
			return;
		if (null != get(list, je.getDescriptor()))
			throw new ElementExistsException(je.getDescriptor());
	}

	/**
	 * ��һ��Ԫ�ؼ����л�ȡһ��Ԫ��
	 * 
	 * @param list
	 *            ����
	 * @param e
	 *            Ԫ��������
	 * @return ����Ԫ�أ���������ڷ��� null
	 */
	static <T extends JavaElement> T get(List<T> list, String descriptor) {
		for (T item : list)
			if (item.is(descriptor))
				return item;
		return null;
	}
}
