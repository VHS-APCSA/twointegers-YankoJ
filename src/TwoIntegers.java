
public class TwoIntegers 
{
private int num1;
private int num2;

public TwoIntegers()
{
	this.num1 = 0;
	this.num2 = 0;
}
public TwoIntegers(int num1, int num2)
{
	this.num1 = num1;
	this.num2 = num2;
	
}
public int getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}
public int sum()
{
	return this.num1+this.num2;
}
public int product()
{
	return num1*num2;
}
public int difference()
{
	return num1-num2;
}
public int quotient()
{
	return num1/num2;
}
public String arithmetic()
{
	String helper;
	helper = "sum: " + sum() + ", product: " + product() + ", difference: " + difference() + ", quotient: " + quotient();
	return helper;
}

public Integer compare()
{
	if (num1>num2) 
	{
		return num1;
	} else if (num1==num2) 
	{
		return null;
	}
	else 
	{
		return num2;
	}
}
public boolean oddOrEvenNum1()
{
	if (num1%2 == 0) 
	{
		return true;
	} 
	else 
	{
		return false;
	}

}
public boolean oddOrEvenNum2()
{
	if (num2%2 == 0) 
	{
		return true;
	} 
	else 
	{
		return false;
	}

}
public boolean isMultiple()
{
	if (num2%num1 == 0) 
	{
		return true;
	} 
	else 
	{
		return false;
	}
}
}

