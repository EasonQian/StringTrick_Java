public class EqualTrick {

	public EqualTrick() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){

		/*
		 * JVM�����ַ���������"+"�����ӣ�����������ڣ�JVM�ͽ������ַ�����"+"�����Ż�Ϊ���Ӻ��ֵ
		 * �ڱ����ڣ����ַ���������ֵ��ȷ������
		 */
		String a = "a1";
		String b = "a" + 1;
		System.out.println(a == b);	// true

		/*
		 * JVM�����ַ������ã��������ַ�����"+"�����У����ַ������ô��ڣ������õ�ֵ�ڳ�����������޷�ȷ����
		 * ��"a" + bb�޷����������Ż�, ֻ���ڳ�������������̬���䲢�����Ӻ���µ�ַ����b
		 * ���a��b�ĵ�ַ�ǲ�һ���ģ�����ͬһ��String����
		 */
		String a1 = "ab";
		String bb = "b";
		String b1 = "a" + bb;
		System.out.println(a1 == b1);	// false

		/*
		 * ����final���εı��������ڱ���ʱ������Ϊ����ֵ��һ�����ؿ����洢���Լ��ĳ������л�Ƕ�뵽�����ֽ�������
		 * ���Դ�ʱ��"a" + bb��"a" + "b"Ч����һ����
		 */
		String a2 = "ab";
		final String bb2 = "b";
		String b2 = "a" + bb2;
		System.out.println(a2 == b2); 	// true


		/*
		 *  String ���õġ�+���ȼ���ÿ���½�һ��StringBuffer���󣬲���append���ӣ����Ч�ʵ���
		 */

	}

}