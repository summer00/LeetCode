package threadTest;

/**
 * 给线程命名；获取当前线程的对象；休眠线程；守护线程；join线程；设置优先级
 */
public class CommonMethodTest {
	public static void main(String[] args) throws InterruptedException {
		// getSetNameTest();
		// sleepTest();
		// daemonTest();
		// joinTest();
		// yieldTest();
		priorityTest();
	}

	public static void priorityTest() {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(this.getName() + "---" + i + "---" + this.getPriority());
					Thread.yield();
				}
			}
		};
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "---" + i);
					Thread.yield();
				}
			}
		});
		t1.setName("11");
		t2.setName("222");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread.MAX_PRIORITY--" + Thread.MAX_PRIORITY + ",Thread.MIN_PRIORITY--"
				+ Thread.MIN_PRIORITY + ",Thread.MIN_PRIORITY--" + Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
	}

	public static void yieldTest() {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(this.getName() + "---" + i);
					Thread.yield();
				}
			}
		};
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "---" + i);
					Thread.yield();
				}
			}
		});
		t1.setName("11");
		t2.setName("222");
		t1.start();
		t2.start();
	}

	/**
	 * Java Thread中， join() 方法主要是让调用改方法的thread完成run方法里面的东西后， 在执行join()方法后面的代码。
	 * 
	 * @throws InterruptedException
	 */
	public static void joinTest() throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(this.getName() + "---------" + i);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "---" + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.setName("11");
		t2.setName("222");
		t1.start();
		t1.join(10);
		t2.start();
		t2.join();
	}

	/**
	 * 设置守护线程
	 */
	public static void daemonTest() {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(this.getName() + "---------" + i);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "---" + i);
				}
			}
		});
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}

	/**
	 * 睡眠
	 */
	public static void sleepTest() {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(this.getName() + "---------" + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "---" + i);
				}
			}
		});
		t1.start();
		t2.start();
	}

	/**
	 * 设置获取线程名称
	 */
	public static void getSetNameTest() {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName() + "---------" + i);
				}
			}
		};
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "---" + i);
				}
			}
		});
		t1.setName("哈哈");
		t2.setName("呵呵");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
	}
}