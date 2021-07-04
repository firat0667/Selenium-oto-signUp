package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\firat\\Desktop\\selenium\\ChromeDriver\\chromedriver.exe");

        Scanner veriAl=new Scanner(System.in);
        System.out.println("User name giriniz");
        String username=veriAl.next();




	  System.out.println("Email giriniz");
	   String email=veriAl.next();

        System.out.println("password giriniz");
        String password=veriAl.next();





        WebDriver driver =new ChromeDriver();


        // ınterface              //class
        driver.manage().window().fullscreen();
        driver.get("https://www.github.com/join");
        Thread.sleep(2000);

        driver.findElement(By.id("user_login")).sendKeys(username);
        Thread.sleep(2000);

        driver.findElement(By.id("user_email")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.id("user_password")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.id("all_emails")).click();











    /*    driver.findElement(By.name("q")).sendKeys(aranacakKelime);
        Thread.sleep(1000);  /*bunu yazmassak anında aramaya basıor  bu yuzden hata oluşuyor  1 sn deleyla olarak açılır 5000 yaparsak 5 sn ye bekler
        driver.findElement(By.className("gNO89b")).click(); */

    }
}
