package tissuefactory.commanddesignpattern;

public class TissueCategoryCommand implements Command{
   Tissue tissue;
   public TissueCategoryCommand(Tissue tissue)
   {
	   this.tissue = tissue;
   }
@Override
public void execute() {
	tissue.categories();	
}   
}
