package threadTest;

/**
 * 创建线程实现
 */
public class CreateThreadTest {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();

		// 使用匿名内部类
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("------cc------------");
				}
			}
		}).start();

		new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("------dddddd------------");
				}
			}
		}.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println("------aa");
		}
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("--bb");
		}
	}
}
/*
 * a.继承Thread : 由于子类重写了Thread类的run(), 当调用start()时, 直接找子类的run()方法
 * 
 * b.实现Runnable : 构造函数中传入了Runnable的引用, 成员变量记住了它,
 * start()调用run()方法时内部判断成员变量Runnable的引用是否为空,
 * 不为空编译时看的是Runnable的run(),运行时执行的是子类的run()方法
 * 
 * 继承Thread---好处是:可以直接使用Thread类中的方法,代码简单;;;弊端是:如果已经有了父类,就不能用这种方法
 * 
 * 实现Runnable接口---好处是:即使自己定义的线程类有了父类也没关系,因为有了父类也可以实现接口,而且接口是可以多实现的;;;
 * 弊端是:不能直接使用Thread中的方法需要先获取到线程对象后,才能得到Thread的方法,代码复杂
 */