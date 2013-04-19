public class EqualTrick {

	public EqualTrick() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){

		/*
		 * JVM对于字符串常量的"+"号连接，将程序编译期，JVM就将常量字符串的"+"连接优化为连接后的值
		 * 在编译期，其字符串常量的值就确定下来
		 */
		String a = "a1";
		String b = "a" + 1;
		System.out.println(a == b);	// true

		/*
		 * JVM对于字符串引用，由于在字符串的"+"连接中，有字符串引用存在，而引用的值在程序编译期是无法确定的
		 * 即"a" + bb无法被编译器优化, 只有在程序运行期来动态分配并将连接后的新地址赋给b
		 * 因此a和b的地址是不一样的，不是同一个String对象
		 */
		String a1 = "ab";
		String bb = "b";
		String b1 = "a" + bb;
		System.out.println(a1 == b1);	// false

		/*
		 * 对于final修饰的变量，它在编译时被解析为常量值的一个本地拷贝存储到自己的常量池中或嵌入到它的字节码流中
		 * 所以此时的"a" + bb和"a" + "b"效果是一样的
		 */
		String a2 = "ab";
		final String bb2 = "b";
		String b2 = "a" + bb2;
		System.out.println(a2 == b2); 	// true


		/*
		 *  String 引用的“+”等价于每次新建一个StringBuffer对象，并用append连接，因此效率底下
		 */

	}

}