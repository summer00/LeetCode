package threadTest;

/**
 * �����߳�ʵ��
 */
public class CreateThreadTest {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();

		// ʹ�������ڲ���
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
 * a.�̳�Thread : ����������д��Thread���run(), ������start()ʱ, ֱ���������run()����
 * 
 * b.ʵ��Runnable : ���캯���д�����Runnable������, ��Ա������ס����,
 * start()����run()����ʱ�ڲ��жϳ�Ա����Runnable�������Ƿ�Ϊ��,
 * ��Ϊ�ձ���ʱ������Runnable��run(),����ʱִ�е��������run()����
 * 
 * �̳�Thread---�ô���:����ֱ��ʹ��Thread���еķ���,�����;;;�׶���:����Ѿ����˸���,�Ͳ��������ַ���
 * 
 * ʵ��Runnable�ӿ�---�ô���:��ʹ�Լ�������߳������˸���Ҳû��ϵ,��Ϊ���˸���Ҳ����ʵ�ֽӿ�,���ҽӿ��ǿ��Զ�ʵ�ֵ�;;;
 * �׶���:����ֱ��ʹ��Thread�еķ�����Ҫ�Ȼ�ȡ���̶߳����,���ܵõ�Thread�ķ���,���븴��
 */