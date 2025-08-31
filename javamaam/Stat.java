package day5;

public class Stat <T extends Number> {

	T [] nums;
	
	public Stat(T [] nums)
	{
		this.nums = nums;
	}
	
	public double calculateAve()
	{
		double res=0;
		for(int i=0; i< nums.length;i++)
		{
			res += nums[i].doubleValue();
		}
		return res/nums.length;
	}
}
