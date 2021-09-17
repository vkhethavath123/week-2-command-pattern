package tissuefactory.commanddesignpattern;

public class TissueCommand {
   
	Command command;
	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	public void executeCommand()
	{
		command.execute();
	}
}
