package edu.examples.java_classes.controller;

import java.util.HashMap;
import java.util.Map;

import edu.examples.java_classes.controller.impl.AddCommand;
import edu.examples.java_classes.controller.impl.GetAllCommand;
import edu.examples.java_classes.controller.impl.ClearCommand;
import edu.examples.java_classes.controller.impl.DeleteEntryCommand;
import edu.examples.java_classes.controller.impl.FindByTextCommand;
import edu.examples.java_classes.controller.impl.NoSuchCommand;
import edu.examples.java_classes.controller.impl.UpdateCommand;

public class CommandProvider {
	
	private final Map<CommandName, Command> repository = new HashMap<>();
	
	CommandProvider(){
		repository.put(CommandName.ADD, new AddCommand());
		repository.put(CommandName.UPDATE, new UpdateCommand());
		repository.put(CommandName.CLEAR, new ClearCommand());
		repository.put(CommandName.DELETEENTRY, new DeleteEntryCommand());
		repository.put(CommandName.FINDBYTEXT, new FindByTextCommand());
		repository.put(CommandName.GETALL, new GetAllCommand());
		repository.put(CommandName.WRONG_REQUEST, new NoSuchCommand());
	}
	
	Command getCommand(String name){
		CommandName commandName =null;
		Command command = null;
		
		try{
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		}catch(IllegalArgumentException | NullPointerException e){
			command = repository.get(CommandName.WRONG_REQUEST);
		}				
		return command;
	}
}
