package Main;

import controller.AuthController;
import views.HomeView;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ventana ventana = new Ventana();
		
		AuthController ac = new AuthController();
		ac.showLogin();
		
	}

}