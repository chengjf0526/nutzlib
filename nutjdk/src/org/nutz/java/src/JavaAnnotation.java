package org.nutz.java.src;

/**
 * ע��ʵ��
 * 
 * @author zozoh(zozohtnt@gmail.com)
 */
public class JavaAnnotation extends JavaElement {

	private JavaAnnotationType type;

	/**
	 * @return ע������
	 */
	public JavaAnnotationType getType() {
		return type;
	}

	/**
	 * ����ע������
	 * 
	 * @param type
	 *            ע������
	 * @return JavaAnnotation
	 */
	public JavaAnnotation setType(JavaAnnotationType type) {
		this.type = type;
		return this;
	}

	@Override
	public String getDescriptor() {
		return "@" + type.getDescriptor();
	}

}
