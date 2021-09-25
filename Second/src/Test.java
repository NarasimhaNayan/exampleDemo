class A {
	static int i = 10;
		public static void show() {
			
			i=100;
			System.out.println(i);
		}
		public void show2() {
			int x=0;
			System.out.println(x);
		}
}
class Test {
	public static void main (String[] args) {
		float f = 12.34F;
		System.out.println(f);
		A a = new A();
		A.show();
		a.show2();
		String s1 ="welcome";
		String s2 = new String("welcome");
		System.out.println(s1==s2);
		System.out.println(s2);
	}
}
