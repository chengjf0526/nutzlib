package org.nutz.java.src;

import java.util.List;

/**
 * ��
 * 
 * @author zozoh(zozohtnt@gmail.com)
 */
public class JavaClass extends JavaParameterizedType {

	/**
	 * ��̬��ʼ�����������൱�� static{...}
	 */
	private JavaMethod initMethod;

	/**
	 * ���������������ֶ�
	 */
	private List<JavaField> fields;

	/**
	 * �������еĹ��캯������� size() Ϊ 0 �����ʾֻ��һ��Ĭ�Ϲ��캯��
	 */
	private List<JavaMethod> constructors;

	public JavaClass() {
		super();
		fields = Srcs.list(JavaField.class);
		constructors = Srcs.list(JavaMethod.class);
	}

	/**
	 * @return ��ʼ����̬����
	 */
	public JavaMethod getInitMethod() {
		return initMethod;
	}

	/**
	 * ���ó�ʼ����̬����
	 * 
	 * @param initMethod
	 *            ��̬����
	 */
	public void setInitMethod(JavaMethod initMethod) {
		this.initMethod = initMethod;
	}

	/**
	 * ����һ�����캯��
	 * 
	 * @param c
	 *            ���캯��
	 * @return JavaClass
	 */
	public JavaClass addConstructor(JavaMethod c) {
		Srcs.assertNoExists(constructors, c);
		constructors.add(c);
		return this;
	}

	/**
	 * �Ƴ����й��캯��
	 * 
	 * @return JavaClass
	 */
	public JavaClass clearConstructors() {
		constructors.clear();
		return this;
	}

	/**
	 * ��ȡһ�����캯��
	 * 
	 * @param descriptor
	 *            ���캯��������
	 * @return ���캯��
	 */
	public JavaMethod getConstructor(String descriptor) {
		return Srcs.get(constructors, descriptor);
	}

	/**
	 * @param descriptor
	 *            ����������
	 * @return ���캯���Ƿ����
	 */
	public boolean hasConstructor(String descriptor) {
		return null != getConstructor(descriptor);
	}

	/**
	 * �Ƴ�һ�����캯��
	 * 
	 * @param method
	 *            ���캯��
	 * @return JavaClass
	 */
	public JavaClass removeConstructor(JavaMethod c) {
		constructors.remove(c);
		return this;
	}

	/**
	 * �Ƴ�һ�����캯��
	 * 
	 * @param descriptor
	 *            ���캯��������
	 * @return JavaClass
	 */
	public JavaClass removeConstructor(String descriptor) {
		JavaMethod c = getConstructor(descriptor);
		if (null != c)
			return removeConstructor(c);
		return this;
	}

	/**
	 * @return ȫ�����캯��
	 */
	public JavaMethod[] getConstructors() {
		return constructors.toArray(new JavaMethod[constructors.size()]);
	}

	/**
	 * ����һ���ֶ�
	 * 
	 * @param field
	 *            �ֶ�
	 * @return JavaClass
	 */
	public JavaClass addfField(JavaField field) {
		Srcs.assertNoExists(fields, field);
		fields.add(field);
		return this;
	}

	/**
	 * �Ƴ�һ���ֶ�
	 * 
	 * @param field
	 *            �ֶ�
	 * @return JavaClass
	 */
	public JavaClass removeField(String name) {
		JavaField f = getField(name);
		if (null != f)
			fields.remove(f);
		return this;
	}

	/**
	 * ��������ֶ�
	 * 
	 * @return JavaClass
	 */
	public JavaClass clearFields() {
		fields.clear();
		return this;
	}

	/**
	 * ��ȡһ���ֶ�
	 * 
	 * @param name
	 *            �ֶ���
	 * @return �ֶ�
	 */
	public JavaField getField(String name) {
		return Srcs.get(fields, name);
	}

	/**
	 * @param descriptor
	 *            �ֶ���
	 * @return �Ƿ����
	 */
	public boolean hasField(String name) {
		return null != getField(name);
	}

	/**
	 * @return ȫ���ֶ�
	 */
	public JavaField[] getFields() {
		return fields.toArray(new JavaField[fields.size()]);
	}
}
