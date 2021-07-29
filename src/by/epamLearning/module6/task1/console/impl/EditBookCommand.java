package by.epamLearning.module6.task1.console.impl;

import by.epamLearning.module6.task1.console.ConsoleCommand;
import by.epamLearning.module6.task1.service.ConsoleService;
import by.epamLearning.module6.task1.service.ServiceProvider;
import by.epamLearning.module6.task1.view.BookView;

public class EditBookCommand implements ConsoleCommand {

	@Override
	public String execute(String... args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		ConsoleService consoleService = provider.getConsoleService();
		String[] sourceBookParams = args[0].substring(1).replaceAll("&&&", "").split("###");
		consoleService.printString("\nOld Id value: " + sourceBookParams[0] + "\n");
		String editedIdValue = consoleService.readString("new Id value", "[1-9][0-9]*");
		if (!exist(editedIdValue))
			editedIdValue = sourceBookParams[0];
		consoleService.printString("\nOld Title value: " + sourceBookParams[1] + "\n");
		String editedTitleValue = consoleService.readString("new Title value", ".*");
		if (!exist(editedTitleValue))
			editedTitleValue = sourceBookParams[1];
		consoleService.printString("\nOld Authors value: " + sourceBookParams[2].replaceAll("##", ", ") + "\n");
		String editedAuthorsValue = consoleService.readString("new Authors value", ".*");
		if (!exist(editedAuthorsValue))
			editedAuthorsValue = sourceBookParams[2];
		consoleService.printString("\nOld book Type value: " + sourceBookParams[3] + "\n");
		String editedTypeValue = consoleService.readString("new book Type value (E_BOOK or PAPER_BOOK)", ".*");
		if (!exist(editedTypeValue))
			editedTypeValue = sourceBookParams[3];
		consoleService.printString("\nOld Description value: " + sourceBookParams[4] + "\n");
		String editedDescriptionValue = consoleService.readString("new Description value", ".*");
		if (!exist(editedDescriptionValue))
			editedDescriptionValue = sourceBookParams[4];
		return BookView.prepareBookParams(editedIdValue, editedTitleValue, editedTypeValue, editedAuthorsValue,
				editedDescriptionValue);
	}

	private boolean exist(String value) {
		return (value != null && !value.isBlank()) ? true : false;
	}

}
