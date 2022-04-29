package Java_Tu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Vector;





public class VectorTest<E> {
	
	Vector<E> v1=new Vector<E>();
	public void Add(String string) {					//vector��add
		v1.add((E) string);
	}
	public void Remove(String string) {					//ɾ��
		int b;
		b=v1.indexOf(string);
		v1.remove(b+1);
		v1.remove(string);
	}
	public boolean Serach(String string) {				//����
		int b;
		b=v1.indexOf(string);
		if(b>=0&&b<v1.capacity()) {
			System.out.println("���ҵ�Ԫ���±�Ϊ��"+(b+1));
			System.out.println(v1.elementAt(b+1));
			return true;}
		else return false;
	}
	public void SetOpject() {							//���л�
		try {
			File file=new File("VectorTest.txt");
			FileOutputStream outputStream=new FileOutputStream(file);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
			
//			Enumeration enumeration=v1.elements();
//			while (enumeration.hasMoreElements()) {
//			
//				objectOutputStream.writeObject(enumeration.nextElement());
//				
//			}
			for (int i = 0; i < v1.size(); i++) {
				objectOutputStream.writeObject(v1.get(i));		//����д���ļ�
				
			}
			
			objectOutputStream.writeObject(null);				//ĩβ�ӡ�null��
			
			outputStream.close();
			objectOutputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void UnSetObject() {									//�����л�
		try {
			File file=new File("VectorTest.txt");
			FileInputStream inputStream=new FileInputStream(file);
			ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
			
			Vector<E> v2=new Vector<>();						//�µ�vector
			
			Object j;
			while((j = objectInputStream.readObject())!=null) {
				
					v2.add((E) j);								//����
				
			}
//			v2.add((E) objectInputStream.readObject());
//			Enumeration enumeration=(Enumeration) objectInputStream.readObject();
//			while (enumeration.hasMoreElements()) {
//				if(enumeration instanceof Shape)
//				v2.add((E) enumeration);
//				
//			}
			inputStream.close();
			objectInputStream.close();
				
		//System.out.println(v2);
			Enumeration enumeration=v2.elements();				//ö�����
			while (enumeration.hasMoreElements()) {
				
				System.out.println(enumeration.nextElement()+"");
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public void showAll() {										//���
		Enumeration enumeration=v1.elements();					//ö��
		while (enumeration.hasMoreElements()) {
			
			System.out.println(enumeration.nextElement()+"");
		}
	}
}
