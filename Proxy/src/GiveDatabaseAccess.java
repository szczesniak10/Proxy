
public class GiveDatabaseAccess implements DatabaseAccess{
	private String agentName;
	public GiveDatabaseAccess( String agtName) {
		this.agentName = agtName;
	}
	public void grantDatabaseAccess() {
		System.out.println(" Agent " + agentName + " was granted access to the Database");
	}
}
