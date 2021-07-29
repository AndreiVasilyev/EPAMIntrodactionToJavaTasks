package by.epamLearning.module6.task1.controller.impl;


import by.epamLearning.module6.task1.controller.Command;
import by.epamLearning.module6.task1.controller.CommandProvider;
import by.epamLearning.module6.task1.controller.Controller;

public class CatalogController implements Controller {

	private CommandProvider commandProvider = new CommandProvider();

	@Override
	public String doAction(String request) {
		String[] params = request.split("\\s+");
		String command = params[0];
		Command currentCommand = commandProvider.getCommand(command);
		String response = currentCommand.execute(params);
		return response;
	}

}
