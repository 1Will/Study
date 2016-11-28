/*������������100���ڵ�����ȡ���ֵ����Сֵ*/
package javaExam1;

public class GetMaxMin {

	public static void main(String[] args) {
		System.out.println("����������������ȡ���ֵ����Сֵ��\n");
		System.out.println("����ʼ��");
		float[] a=new float[args.length];
		for(int j=0;j<args.length;j++){
			a[j]=Float.parseFloat(args[j]);
		}
		float max=a[0];
		float min=a[0];
		float avg=0f;
		for(int i=0;i<args.length;i++){
			max = (max>a[i])?max:a[i];   //ѭ��ȡ�����������ֵ
			min = (min<a[i])?min:a[i];   //ѭ��ȡ����������Сֵ
		}
		avg =(max+min)/2;
		System.out.println("��������ֵΪ��" +max);
		System.out.println("�������СֵΪ��" +min);
		System.out.println("��������ֵ����Сֵ��ƽ��ֵΪ��" +avg);
	}
}
