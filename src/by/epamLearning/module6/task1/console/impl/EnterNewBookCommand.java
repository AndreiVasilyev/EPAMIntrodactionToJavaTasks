package by.epamLearning.module6.task1.console.impl;


import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.service.ConsoleService;
import by.epamLearning.module6.task1.service.ServiceProvider;
import by.epamLearning.module6.task1.view.BookView;

public class EnterNewBookCommand implements ConsoleCommand {

	@Override
	public String execute(String... args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ConsoleService consoleService = provider.getConsoleService();		
		String id="";		
		if (args == null || (args.length > 0 && !"-id".equalsIgnoreCase(args[0]))
				|| (args.length > 1 && !"-id".equalsIgnoreCase(args[1]) && !"-id".equalsIgnoreCase(args[0]))) {
			id = consoleService.readString("id", "[0-9]*");			
		}
		String title = consoleService.readString("book title", ".*");		
		String bookType = consoleService.readString("book type (PAPER_BOOK or E_BOOK)", ".*");		
		String author = consoleService.readString("author", ".*");
		String description="";
		if (args == null || (args.length > 0 && !"-desc".equalsIgnoreCase(args[0]))
				|| (args.length > 1 && !"-desc".equalsIgnoreCase(args[1]) && !"-desc".equalsIgnoreCase(args[0]))) {
			description = consoleService.readString("description", ".*");			
		}		
		return BookView.prepareBookParams(id,title,bookType,author,description);
	}
}
