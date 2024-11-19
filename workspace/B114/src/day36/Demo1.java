package day36;

public class Demo1 {

	public static void main(String[] args) {
		byte a1=10;
//		Byte a2=new Byte(a1);
		Byte a2=Byte.valueOf(a1);//converting from byte(primitive) to Byte (non-prmitive) --boxing
		System.out.println(a1);
		System.out.println(a2.toString());
		System.out.println(a2);
		
		byte a3=a2.byteValue();//converting from Byte (non-prmitive)  to byte(primitive) unboxing 
		System.out.println(a3);
		
		byte b1=10;
		Byte b2=b1;//auto boxing
		byte b3=b2;//auto unboxing
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		Byte b4=10;
		System.out.println(b4);
		
	}

}
