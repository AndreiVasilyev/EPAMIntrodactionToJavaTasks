package by.epamLearning.module6.task1.console.impl;

import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.service.ConsoleService;
import by.epamLearning.module6.task1.service.ServiceProvider;

public class PrintBooksListCommand implements ConsoleCommand {

	@Override
	public String execute(String... args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ConsoleService consoleService = provider.getConsoleService();
		String[] bookStrings = args[0].substring(1).trim().split("&&&");		
		consoleService.printString("\n\n");
		String formatedString=null;
		for (String string : bookStrings) {
			String[] bookProperties = string.trim().split("###");
			formatedString=String.format("%-3s%-15s%-25s%-12s%-50s\n\n", bookProperties[0],bookProperties[1],bookProperties[2].replaceAll("##", ", "),bookProperties[3],bookProperties[4]);
			consoleService.printString(formatedString);			
		}		
		consoleService.readString("any key to continue (Press Enter)...", ".*");
		return "";
	}

}
