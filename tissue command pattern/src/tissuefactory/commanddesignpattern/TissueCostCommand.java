package tissuefactory.commanddesignpattern;

public class TissueCostCommand implements Command{
	   Tissue tissue;
	   public TissueCostCommand(Tissue tissue)
	   {
		   this.tissue = tissue;
	   }
	@Override
	public void execute() {
		tissue.cost();
	}   
	}
