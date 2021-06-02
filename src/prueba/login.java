package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		//Feature 1
		//Como usuario: quiero validar que un usuario no registrado no pueda ingresar a la web
		
		//Paso 1 - Configurar el driver con GoogleChrome
		System.setProperty("webdriver.chrome.driver", "/Users/nany.alvarez/Documents/chromedriver");
		driver = new  ChromeDriver();
		
		//Paso 2 - Abrir la pagina web soucedemo
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		
		//Paso 3 - Ingresar usuario
		driver.findElement(By.name("user-name")).sendKeys("prueba");
		 
		//Paso 4 - Ingresar  Password
		driver.findElement(By.name("password")).sendKeys("noexisto");
		 
		//Paso 5 - Hacer login
		driver.findElement(By.name("login-button")).submit();
		
		//se muestra mensaje de usuario no registrado
		System.out.println("Test case caso fallido: muestra mensaje de error:Epic sadface: Username and password do not match any user in this service");
		
		Thread.sleep(2000);
		driver.close();
		
		//Feature 2
		//Como usuario: quiero que se muestre un mensaje de validacion de contraseña cuando el usuario no ingresa la misma  
		
	    //Paso 1 - Configurar el driver con GoogleChrome
		System.setProperty("webdriver.chrome.driver", "/Users/nany.alvarez/Documents/chromedriver");
		driver = new  ChromeDriver();
				
		//Paso 2 - Abrir la pagina web soucedemo
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
				
		//Paso 3 - Ingresar usuario
		driver.findElement(By.name("user-name")).sendKeys("@");
				 	 
		//Paso 4 - Hacer login
		driver.findElement(By.name("login-button")).submit();
				
		//se muestra mensaje de usuario no registrado
		System.out.println("Epic sadface: Password is required");
				
		Thread.sleep(2000);
		driver.close();
		
		//Feature 3
		//Como usuario: quiero que se muestre un mensaje de validacion de usuario cuando el usuario no ingresa el user
				
	    //Paso 1 - Configurar el driver con GoogleChrome
		System.setProperty("webdriver.chrome.driver", "/Users/nany.alvarez/Documents/chromedriver");
		driver = new  ChromeDriver();
						
		//Paso 2 - Abrir la pagina web soucedemo
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
						
		//Paso 3 - Ingresar usuario
		driver.findElement(By.name("user-name")).click();
						 	 			
		//se muestra mensaje de usuario no registrado
		System.out.println("Epic sadface: Username is required");
						
		Thread.sleep(2000);
		driver.close();
		
		
			
	}

}
