
public class EmailChecker {

	private String userEmail;
	EmailChecker(String userInput)
	{
		userEmail = userInput;
	}
	
	public boolean hasAt()
	{
		boolean retval = false;
		int atCounter = 0;
		for (int i = 0; i < userEmail.length(); i++)
		{
			if(userEmail.charAt(i) == '@')
			{
				atCounter++;
			}
		}
		if(atCounter > 1 || atCounter == 0)
		{
			retval = false;
		}
		else
		{
			retval = true;
		}
		return retval;
	}
	public boolean hasPeriodAfterAt()
	{
		boolean retval = false;
		boolean hasSeenAt = false;
		if(hasAt())
		{
			for (int i = 0; i < userEmail.length(); i++)
			{
				if(userEmail.charAt(i) == '.')
				{
					if(hasSeenAt)
					{
						return true;
					}
				}
				if(userEmail.charAt(i) == '@')
				{
					hasSeenAt = true;
				}
				
			}
			
		}
		
		return retval;
	}
	
	public String getEmail()
	{
		return userEmail;
	}
}
