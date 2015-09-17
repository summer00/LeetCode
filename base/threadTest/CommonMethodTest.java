package threadTest;

/**
 * ���߳���������ȡ��ǰ�̵߳Ķ��������߳�
 */
public class CommonMethodTest {
	public static void main(String[] args) throws InterruptedException {
		// getSetNameTest();
		// sleepTest();
		// daemonTest();
		joinTest();
	}

	/**
	 * Java Thread�У� join() ������Ҫ���õ��øķ�����thread���run��������Ķ����� ��ִ��join()��������Ĵ��롣
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
	 * �����ػ��߳�
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
	 * ˯��
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
	 * ���û�ȡ�߳�����
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
		t1.setName("����");
		t2.setName("�Ǻ�");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
	}
}