
public class Test {
	public static void main(String[]args)
	{
		DatabaseAccess access = new ProxyDatabaseAccess("Kamil Szczesniak");
		access.grantDatabaseAccess();

	}
}
