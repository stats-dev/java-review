package chap22_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import chap22_IO.clazz.Car;

public class _13_objectStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(
							"D:/lecture/Java/oos.txt"));
		
			
			
			Car c1 = new Car("현대", "아반떼", 155.6, 2000);
			Car c2 = new Car("현대", "소나타", 185.3, 3000);
			
			//직렬화해서 byte로 들어간다.
			//객체를 직렬화하여 멤버변수들을 byte로 변경해서 출력.
			oos.writeObject(c1);
			oos.writeObject(c2);
			
			oos.flush();
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("D:/lecture/Java/oos.txt"));
			
			Car car1 = (Car)ois.readObject(); //이렇게 형변환해줘야함.
			Car car2 = (Car)ois.readObject();
			
			System.out.println(car1.toString());
			System.out.println(car2.toString());
			
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //모든 정보가 나오므로 해킹에 매우 취약.
		} catch (IOException e) {
			e.printStackTrace(); //이건 안됨. 보안을 위해 로거를 사용해서 출력하게 변경필요!
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		
		
		
		

	}

}
