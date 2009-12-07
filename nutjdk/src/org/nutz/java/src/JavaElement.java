package org.nutz.java.src;

import java.util.List;

import org.nutz.java.exception.ElementExistsException;

public abstract class JavaElement {

	private String name;

	private List<JavaAnnotation> anns;

	protected JavaElement() {
		anns = Srcs.list(JavaAnnotation.class);
	}

	/**
	 * @return ��ǰ������ַ�����
	 */
	public abstract String getDescriptor();

	/**
	 * @return Ԫ����
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            Ԫ����
	 * @return JavaElement
	 */
	public JavaElement setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * ��ǰ�����Ƿ�ƥ��������
	 * 
	 * @param descriptor
	 *            ������
	 * @return �Ƿ�ƥ��
	 * 
	 * @see org.nutz.java.src.Describable
	 */
	public boolean is(String descriptor) {
		return this.getDescriptor().equals(descriptor);
	}

	/**
	 * �Ƿ������һ��Ԫ�����
	 * 
	 * @param ele
	 *            �����Ԫ��
	 * @return �Ƿ����
	 */
	public boolean is(JavaElement ele) {
		if (null == ele)
			return false;
		if (this.getClass() != ele.getClass())
			return false;
		return is(ele.getDescriptor());
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (obj instanceof JavaElement)
			return false;
		return is((JavaElement) obj);
	}

	@Override
	public int hashCode() {
		return this.getDescriptor().hashCode();
	}

	/**
	 * ����һ��ע��
	 * 
	 * @param ann
	 *            ע��
	 * @return JavaElement
	 */
	public JavaElement addAnnotation(JavaAnnotation ann) throws ElementExistsException {
		Srcs.assertNoExists(anns, ann);
		return this;
	}

	/**
	 * �Ƴ�һ��ע��
	 * 
	 * @param ann
	 *            ע������
	 * @return JavaElement
	 */
	public JavaElement removeAnnotation(JavaAnnotationType annType) {
		JavaAnnotation ann = this.getAnnotation(annType);
		if (null != ann)
			anns.remove(ann);
		return this;
	}

	/**
	 * ����ע�����ͻ��һ��ע��ʵ��
	 * 
	 * @param annType
	 *            ע������
	 * @return ע��ʵ��
	 */
	public JavaAnnotation getAnnotation(JavaAnnotationType annType) {
		return Srcs.get(anns, "@" + annType.getDescriptor());
	}

	/**
	 * @return ע���б�����ר��
	 */
	protected List<JavaAnnotation> annotations() {
		return anns;
	}

	/**
	 * ������е�ע��
	 * 
	 * @return JavaElement
	 */
	public JavaElement clearAnnotations() {
		anns.clear();
		return this;
	}

	/**
	 * @param annType
	 *            ע������
	 * @return �Ƿ����ע��
	 */
	public boolean hasAnnotation(JavaAnnotationType annType) {
		return null != getAnnotation(annType);
	}
}
