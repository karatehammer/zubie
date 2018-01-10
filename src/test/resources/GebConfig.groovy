/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/

import org.openqa.selenium.chrome.ChromeDriver


waiting {
	timeout = 2
}
reportsDir = new File("build/reports")

baseUrl = "http://www.google.com"

driver = {
	def chromeDriverPlace = new File('src/test/resources/chromedriver.exe')
	System.setProperty('webdriver.chrome.driver', chromeDriverPlace.absolutePath)
    new ChromeDriver()
}