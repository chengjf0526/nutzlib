package org.nutz.java.src;

import java.util.List;

import org.nutz.java.exception.ElementExistsException;

/**
 * ����
 * 
 * @author zozoh(zozohtnt@gmail.com)
 */
public abstract class JavaParameterizedType extends JavaType {

	/**
	 * ���������������з���
	 */
	private List<JavaMethod> methods;

	protected JavaParameterizedType() {
		super();
		methods = Srcs.list(JavaMethod.class);
	}

	/**
	 * @return ��ǰ�������еķ���
	 */
	public JavaMethod[] getMethods() {
		return methods.toArray(new JavaMethod[methods.size()]);
	}

	/**
	 * @return ��ǰ�������еķ����б�������ʹ��
	 */
	protected List<JavaMethod> methods() {
		return this.methods;
	}

	/**
	 * ���һ��������
	 * 
	 * @param method
	 *            �µķ���
	 * @return JavaParameterizedType
	 * @throws ElementExistsException
	 *             ����Ѿ����˸÷���
	 */
	public JavaParameterizedType addMethod(JavaMethod method) throws ElementExistsException {
		Srcs.assertNoExists(methods, method);
		methods.add(method);
		return this;
	}

	/**
	 * ����һ�� Java �����������������һ������
	 * 
	 * @param descriptor
	 *            ����������
	 * @return ������null ��ʾ������
	 * 
	 * @see org.nutz.java.src.Describable
	 */
	public JavaMethod getMethod(String descriptor) {
		return Srcs.get(methods, descriptor);
	}

	/**
	 * @param descriptor
	 *            ����������
	 * @return �����Ƿ����
	 */
	public boolean hasMethod(String descriptor) {
		return null != getMethod(descriptor);
	}

	/**
	 * �����ǰ�������������з���
	 * 
	 * @return JavaParameterizedType
	 */
	public JavaParameterizedType clearMethods() {
		methods.clear();
		return this;
	}

	/**
	 * �Ƴ�һ������
	 * 
	 * @param method
	 *            ����
	 * @return JavaParameterizedType
	 */
	public JavaParameterizedType removeMethod(JavaMethod method) {
		methods.remove(method);
		return this;
	}

	/**
	 * �Ƴ�һ������
	 * 
	 * @param descriptor
	 *            ����������
	 * @return JavaParameterizedType
	 */
	public JavaParameterizedType removeMethod(String descriptor) {
		JavaMethod m = getMethod(descriptor);
		if (null != m)
			return removeMethod(m);
		return this;
	}
}
