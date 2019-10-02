
public class ProxyDatabaseAccess implements DatabaseAccess{
	private String agentName;
	private GiveDatabaseAccess trueaccess;
		public ProxyDatabaseAccess(String agentName) {
	this.agentName = agentName;
	
}
		
		
	public void grantDatabaseAccess() {
		if(getRole(agentName) > 4)
		{
			trueaccess = new GiveDatabaseAccess(agentName);
			trueaccess.grantDatabaseAccess();
		}
		else {
			System.out.println(" No Database access could be granted. "); }
	}
	
	public int getRole(String agentName) {
		return 5;
	
		  
		}

}
