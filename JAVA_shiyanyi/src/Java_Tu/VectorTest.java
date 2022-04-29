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
	public void Add(String string) {					//vector的add
		v1.add((E) string);
	}
	public void Remove(String string) {					//删除
		int b;
		b=v1.indexOf(string);
		v1.remove(b+1);
		v1.remove(string);
	}
	public boolean Serach(String string) {				//查找
		int b;
		b=v1.indexOf(string);
		if(b>=0&&b<v1.capacity()) {
			System.out.println("查找的元素下标为："+(b+1));
			System.out.println(v1.elementAt(b+1));
			return true;}
		else return false;
	}
	public void SetOpject() {							//序列化
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
				objectOutputStream.writeObject(v1.get(i));		//迭代写入文件
				
			}
			
			objectOutputStream.writeObject(null);				//末尾加、null、
			
			outputStream.close();
			objectOutputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void UnSetObject() {									//反序列化
		try {
			File file=new File("VectorTest.txt");
			FileInputStream inputStream=new FileInputStream(file);
			ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
			
			Vector<E> v2=new Vector<>();						//新的vector
			
			Object j;
			while((j = objectInputStream.readObject())!=null) {
				
					v2.add((E) j);								//加载
				
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
			Enumeration enumeration=v2.elements();				//枚举输出
			while (enumeration.hasMoreElements()) {
				
				System.out.println(enumeration.nextElement()+"");
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public void showAll() {										//输出
		Enumeration enumeration=v1.elements();					//枚举
		while (enumeration.hasMoreElements()) {
			
			System.out.println(enumeration.nextElement()+"");
		}
	}
}
