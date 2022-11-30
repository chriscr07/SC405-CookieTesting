import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CookieTesting {
	
	String ChromeDriver_Directory = "C:\\Users\\Christopher Cruz\\Desktop\\DEMO\\chromedriver.exe";
	WebDriver driver;


	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", ChromeDriver_Directory);
		WebDriver driver = new ChromeDriver();
		
			
				driver.get("https://www.dunu506.com/users/sign_in"); //Obtiene el website al que se va a ingresar
				driver.manage().window().maximize(); //Maximiza la ventana del navegador
				driver.manage().deleteAllCookies(); //Elimina todas las cookies del navegador (Sirve para evitar errores al cargar)
				System.out.println("Todas las Cookies se eliminaron");  
      
		        //Ingresamos un usuario y contraseña que sean validos para poder iniciar sesion en la pagina.
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/form/div[1]/input")).sendKeys("cr7878.cc@outlook.com"); //Ingresa el usuario al campo designado
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/form/div[2]/input")).sendKeys("bj2UeNrYT7bmsKi"); //Ingresa la contraseña al campo designado
		        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/form/input[2]")).click(); //Da click al botón de Inicio de sesión
		        		        
		        driver.manage().addCookie(new Cookie("NewCookie", "fastor12"));   //Creamos una nueva cookie para luego pasarle un valor.
		        System.out.println("Cookie con el nombre NewCookie fue creada"); 
		        Cookie cookie = driver.manage().getCookieNamed("NewCookie");   //Obtenemos la cookie con el nombre "NewCookie"
		        System.out.println(cookie);                                     
		        
		        driver.manage().deleteCookieNamed("fastor12"); //Borramos la cookie con el nombre en específico
		        System.out.println("La cookie con el nombre " + "fastor12 " + "fue eliminada");

		        Set<Cookie> cookies = driver.manage().getCookies(); //Obtenemos todas las cookies creadas
		        System.out.println("Cookies creadas para el usuario: ");
		        System.out.println(cookie);
		     	       
		
	}
	
	
	public static void main(String[] args) {

		CookieTesting Cookies = new CookieTesting();
		Cookies.launchbrowser();
				
		}

	}

