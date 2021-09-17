package tissuefactory.commanddesignpattern;

public class TissueFactory {

	public static void main(String[] args) {
		Tissue tissue =new Tissue();
		TissueCommand command = new TissueCommand();
		command.setCommand(new TissueCategoryCommand(tissue));
		command.executeCommand();
		
		command.setCommand(new TissueThicknessCommand(tissue));
		command.executeCommand();
		
		command.setCommand(new TissueCostCommand(tissue));
		command.executeCommand();		
	}
}
