public class EmailChecker
{
	public boolean check(String email)
	{
		boolean retVal = true;
		
		if(checkForBadChars(email))
		{
			retVal = false;
		}
		
		return retVal;
	}
	
	private boolean checkForBadChars(String email)
	{
		boolean retVal = false;
		
		for(int i = 0; i < email.length(); i++)
		{
			if((email.charAt(i) >= '@' && email.charAt(i) <= 'Z') ||
				(email.charAt(i) >= 'a' && email.charAt(i) <= 'z') ||
				(email.charAt(i) >= '0' && email.charAt(i) <= '9') ||
				email.charAt(i) == '.' || email.charAt(i) == '_')
			{
				retVal = true;
				break;
			}
		}
		
		return retVal;
	}
}
