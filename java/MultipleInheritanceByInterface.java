package Core_Java_Practice;

interface First
{
	int num = 101;
	void show();
}

interface Second
{
	int num = 222;
	void show();
}

class MultipleInheritance implements First , Second
{
	public void show()
	{
		System.out.println("Interface First num : "+First.num);
		System.out.println("Interface Second num : "+Second.num);
		System.out.println("This is Show() Method");
	}
}

public class MultipleInheritanceByInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj = new MultipleInheritance();
		obj.show();
	}

}
