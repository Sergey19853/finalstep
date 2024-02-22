package edu.examples.java_classes.main;

import edu.examples.java_classes.controller.Controller;

public class Main {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
		String request;
		String response;
		
		request = "GETALL\n";
		response = controller.doAction(request);
		System.out.println(response);
		
		request = "ADD\nnameMedicine=Аспирин\npharmacy=Центральная аптека\ninstructions=от головной боли\namount=2\nprice=20.2\ncity=Минск";
		response = controller.doAction(request);
		System.out.println(response);

//		request = "FINDBYTEXT\nfind=Центральная";
//		response = controller.doAction(request);
//		System.out.println(response);
		
//		request = "UPDATE\nid=808af100-7251-431e-b174-f7be08e6af70\nnameMedicine=Аспирин\npharmacy=Центральная аптека\ninstructions=от головы\namount=2\nprice=20.2\ncity=Барановичи";
//		response = controller.doAction(request);
//		System.out.println(response);
		
//		request = "DELETEENTRY\nid=808af100-7251-431e-b174-f7be08e6af70";
//		response = controller.doAction(request);
//		System.out.println(response);
		
//		request = "CLEAR\n";
//		response = controller.doAction(request);
//		System.out.println(response);
	}

}
