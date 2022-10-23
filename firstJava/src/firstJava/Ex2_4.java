package firstJava;
public class Ex2_4
{
	public static void main(String[] args)
	{
		int number = 0x54;
		System.out.printf("input number: 0x%x\n", number);
		System.out.printf("reversed bit: 0x%x\n", reverseBits(number));
	}
	public static int reverseBits(int x)
	{
		 int reverse=0;
		 for(int i = 0; i < 4*8; ++i, x>>=1)
		 {
			 reverse <<= 1;
			 reverse |= (x&1);
			 
		 }
		 return reverse;
	}

}