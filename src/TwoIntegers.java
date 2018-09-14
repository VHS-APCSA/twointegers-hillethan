public class TwoIntegers 
{
	private int num;
	private int num2;
	
	public TwoIntegers()
	{
		num = -1;
		num = -1;
	}
	public TwoIntegers(int num, int num2)
	{
		this.num = num;
		this.num2 = num2;
	}
	public int getNum()
	{
		return num;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public String arithmetic()
	{
		int add = num + num2;
		int quo = num % num2;
		int mult = num * num2;
		double div = (double) num / num2;
		
		return num + " + " + num2 + " = " + add + ", " + num + " % " + num2 + " = " + quo + ", " + num + " * " + num2 + " = " + mult + ", " + num + " / " + num2 + " = " + div;
	}
	public int larger()
	{
		if(num > num2)
		{
			return num;
		}
		else if(num < num2)
		{
			return num2;
		}
		else 
		{
			return num;
		}
	}
	public boolean isEven()
	{
		int sum= num + num2;
		if(sum % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean multiple()
	{
		if(num2 % num ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}