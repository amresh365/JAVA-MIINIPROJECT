package pac.bankapp;

public interface IBaseRate {
default double getBaseRate()
{
	return 2.5;
}
}
