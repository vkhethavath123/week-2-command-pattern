package tissuefactory.commanddesignpattern;

public class TissueThicknessCommand implements Command{
	   Tissue tissue;
	   public TissueThicknessCommand(Tissue tissue)
	   {
		   this.tissue = tissue;
	   }
	@Override
	public void execute() {
		tissue.thickness();
	}   
	}
