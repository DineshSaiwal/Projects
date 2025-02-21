package Base_Package;


import java.io.IOException;

import Scenarios.Login_Page;

 
public class PowerGear{
	
	
	public static void  Login () throws IOException, InterruptedException  {
	   
		Login_Page Obj=new  Login_Page(Base_Class.driver);
		Obj.EnterMail();
		Obj.setPassword();
		Obj.ClickSignin();
		Obj.Accept_Popup();
		Obj.ToastClose();
 		 
	    
	}	
	

}

