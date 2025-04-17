package Design_Patterns;

public class BurgerReturn {
	public static burger burg(String type)
	{
		if (type.equals("veg"))
		{
			return new vegburger();
		}
		if (type.equals("chicken"))
		{
			return new nonveg_Burger();
		}
		return null;
	}
}
