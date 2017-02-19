
public class loganalyzer {

	
		
	private IExtensionManager manager;
	
	public loganalyzer(){
		//manager = new FileExtensionManager();
	}
	public loganalyzer(IExtensionManager mgr){
		manager = mgr;
	}
	public boolean IsValidLogFileName(String filename){
		return manager.IsValid(filename);
	}
	
	
}
