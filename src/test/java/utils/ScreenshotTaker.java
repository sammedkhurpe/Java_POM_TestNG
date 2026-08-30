package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Page;

public class ScreenshotTaker 
{
	public static void takescreenshot(Page page, String screenshotname)
	{
		try 
		{
			Files.createDirectories(Paths.get("snapshots"));
			String timestamp=LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyy_HH-mm-ss"));
			String filename=screenshotname+"_"+timestamp+".png";
			
			page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("snapshots/"+filename)).setFullPage(true));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
