//Pedir correo y comprobar si esta "@" y "."
//
import java.io.*;
import javax.swing.*;

public class ComprobacionMail {
    public static void main  (String [] args) {
        

	  for (int i = 3; i >-1; i--) {
		
///////////////usuario,correo////////////////////////
		String usuario = JOptionPane.showInputDialog(null, "Usuario: ", "Registro", 1);
        String correo = JOptionPane.showInputDialog(null, "introduzca su correo electronico", "Correo", 1); 
      
/////////////////////sacando si hay @ o no////////////
        int confirmacion = correo.indexOf("@");  
        int confirmacion1 = correo.indexOf(".");
        if ((confirmacion != -1) & (confirmacion1 != -1)){
        
///////////////////// contraseña/////////////////
        JPasswordField pwd = new JPasswordField(10);
        
		int action = JOptionPane.showConfirmDialog(null, pwd,"Enter password",JOptionPane.OK_CANCEL_OPTION);
		
		String contra=new String(pwd.getPassword());
///////////////////////condicionales//////////////
		  
		  
		  
      //if ((confirmacion != -1) & (confirmacion1 != -1)){
			if (!contra.equals("")){
				JOptionPane.showMessageDialog(null, "Correcto, tu usuario es "+usuario+ " tu correo es:"+correo+" y tu contraseña es; "+contra,"Resumen",1);
			//System.out.println("Correcto, tu usuario es "+usuario+ " tu correo es:"+correo+" y tu contraseña es; "+contra);
				break;
			
				}
			
		
		
		
			else
		//{System.out.println("la contraseña no puede ir en blanco., tienes: "+i+" intentos");}
			{JOptionPane.showMessageDialog(null, "la contraseña no puede ir en blanco, intentos restantes"+i,"mensaje",0);}


      }
      else
		{JOptionPane.showMessageDialog(null, "el correo electronico esta mal introducido, intentos restantes: "+i,"mensaje",0);}

   
}

}
}

