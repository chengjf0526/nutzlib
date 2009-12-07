package org.nutz.java.src;

/**
 * Java �ĳ����������
 * 
 * @author zozoh(zozohtnt@gmail.com)
 */
public abstract class JavaType extends JavaElement{

	private JavaPackage _package;

	/**
	 * @return ȫ��
	 */
	public String getFullName() {
		return _package.getFullName() + "." + getName();
	}

	/**
	 * ����ȫ��
	 * 
	 * @param name
	 *            ȫ��
	 * @return JavaType
	 */
	public JavaType setFullName(String fullName) {
		int pos = fullName.lastIndexOf('.');
		this._package = new JavaPackage(fullName.substring(0, pos));
		this.setName(fullName.substring(pos + 1));
		return this;
	}

	/**
	 * ���ð�
	 * 
	 * @param jp
	 *            ��
	 * @return JavaType
	 */
	public JavaType setPackage(JavaPackage jp) {
		_package = jp;
		return this;
	}

	/**
	 * @return ��
	 */
	public JavaPackage getPackage() {
		return _package;
	}

	public String getDescriptor() {
		return "L" + getName() + ";";
	}

}
