package Oops.Pgm;

class Addition1
{
	int a;
	int b;
	float c;
	double d;

void add(int a,int b)
{
	int sum=a+b;
	System.out.println("sum of two int value is ="+sum);
}
void add(int a,float bf)
{
	float sum=a+c;
	System.out.println("sum of integer and float value is= "+sum);
}
void add(int a,double c)
{
	double sum=a+d;
	System.out.println("sum of integer and double value is="+sum);
}
}

public class Additions_Of_Oops {

	public static void main(String[] args) {
		Addition1 ob=new Addition1();
		ob.add(23,44);
		ob.add(55,87.65f);
		ob.add(66,90.7);
			}

		}

