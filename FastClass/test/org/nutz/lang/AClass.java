package org.nutz.lang;

import java.util.Date;

public class AClass implements Runnable{

	public void pp() {
		System.currentTimeMillis();
		// System.out.println("I am here");
	}

	public void xxx() {
		System.out.println("���ڵ�ʱ����: " + new Date());
	}

	public void yy(Object in) {
		System.out.println("�������" + in);
	}

	public void xx(Class<?> xx) {

	}

	public void xx3(int[] xx) {
		System.out.println("��������!");
	}

	public void xx311(int[][][][][] xx) {

	}

	public void xxwert(Integer xx) {

	}

	public void xxqwtqwet(Object[] xx) {

	}

	public void xxqwt(Class<?> xx) {

	}

	public void xxqtweqt(Class<?> xx) {

	}

	public void xxwqetqwet(Class<?> xx) {

	}

	public void pp(int x) {
	}

	public void ppx(long x) {
	}

	public void ppxx(short x) {
	}

	public void ppxxx(float x) {
	}

	public void ppxxxx(double x) {
	}

	public void ppxxxxx(byte x) {
	}

	public void ppxxxxxx(char x) {
	}

	public void ppxxxxxxx(boolean x) {
	}

	public static final void xxxxyyy() {
		System.out.println("��ӡ������!");
	}

	public String toString() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!��������!");
		return super.toString();
	}

	public void finalize() throws Throwable {
//		System.out.println("���Ǳ��̳е��޷��صķ���");
		super.finalize();
	}
	
	public void run(){
		System.out.println("I am running");
	}
	
	@Override
	public int hashCode() {
		System.out.println("�ܵ�������");
		return super.hashCode();
	}
}