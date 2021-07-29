package by.epamLearning.module6.task1.console.impl;

import by.epamLearning.module6.task1.console.Console;
import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.console.ConsoleCommandProvider;

public class ConsoleImpl implements Console{

	private ConsoleCommandProvider provider=new ConsoleCommandProvider();
	
	@Override
	public String doAction(String commandName, String... args) {
		ConsoleCommand command=provider.getConsoleCommand(commandName);
		return command.execute(args);		
	}
}
