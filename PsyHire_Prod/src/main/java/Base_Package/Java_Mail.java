package Base_Package;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.mail.*;

public class Java_Mail extends Base_Class{
	

public static void sendmail() throws EmailException {
				Date date = new Date();
				SimpleDateFormat Date_Format = new SimpleDateFormat("dd-MMM kk:mm");
				String formattedDate = Date_Format.format(date);
				
			  EmailAttachment attachment = new EmailAttachment();
			  attachment.setPath(Utility_Class.userdir+"\\PsyHire_Automation_Report.html");
			  attachment.setDisposition(EmailAttachment.ATTACHMENT);
			  attachment.setDescription("PsyHire"+" "+formattedDate+".html");
			  attachment.setName("PsyHire");
			  
			
			  MultiPartEmail email = new MultiPartEmail();
			  email.setHostName("Email address");
			  email.setSmtpPort(465);
			  email.setAuthenticator(new DefaultAuthenticator("Email address", "Password"));
			  email.setSSLOnConnect(true);
			  email.setTLS(true);
			  email.setFrom("Email adddress");
			  email.setSubject("Prod : PsyHire Automation Report"+" "+formattedDate);
			
		      String signature = "\n\nBest regards,\nDinesh Saiwal Team";
		      
		      email.setMsg(result+signature);
		     
			  email.addTo("dinesh.saiwal@aptagrim.com");


			  email.attach(attachment);
			  
			  email.send();
			  
			  System.out.println("*************************Email Sent Successfully *****************************");
  
}}