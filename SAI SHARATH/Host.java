
public class Host {
	
	private int numberOfTables=5;
	private int numberOfAllocatedTables=0;
	private boolean status;
	public boolean getAllocationStatus()
	{
		if(numberOfAllocatedTables<numberOfTables)
		{
			System.out.println("Host allots a table for customer");
			numberOfAllocatedTables++;
			status=true;
		
		}
		else if(numberOfAllocatedTables==numberOfTables)
		{
			System.out.println("Sorry You need to wait in the queue");
			status=false;
		}
		return status;
	}

}
