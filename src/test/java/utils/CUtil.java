package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class CUtil {
	private static WebDriver webDriver;

	private static boolean HIGHLIGHT_SWITCH = true;

	private final static int WAITING_TIME = 30;

	public static void setWebDriver(WebDriver _webDriver) {
		webDriver = _webDriver;
	}

	public static boolean javascript_highlight(By by, String borderColor, String borderType, int borderThickness) {
		try {
			WebElement pageElement = webDriver.findElement(by);
			if (HIGHLIGHT_SWITCH) {
				if (borderColor.isEmpty()) {
					borderColor = "red";
				}
				if (borderType.isEmpty()) {
					borderType = "solid";
				}
				if (webDriver instanceof JavascriptExecutor) {
					((JavascriptExecutor) webDriver).executeScript("arguments[0].style.border='" + borderThickness
							+ "px " + borderType + " " + borderColor + "'", pageElement);
				}
			}
			return true;
		} catch (ElementNotVisibleException | NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
	}

	public static boolean javascript_highlight(WebElement pageElement, String borderColor, String borderType,
			int borderThickness) {
		try {
			if (HIGHLIGHT_SWITCH) {
				if (borderColor.isEmpty()) {
					borderColor = "red";
				}
				if (borderType.isEmpty()) {
					borderType = "solid";
				}
				if (webDriver instanceof JavascriptExecutor) {
					((JavascriptExecutor) webDriver).executeScript("arguments[0].style.border='" + borderThickness
							+ "px " + borderType + " " + borderColor + "'", pageElement);
				}
			}
			return true;
		} catch (ElementNotVisibleException | NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
	}

	public static void waitForElement(final By by) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver).withTimeout(WAITING_TIME, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(ElementNotVisibleException.class).ignoring(TimeoutException.class)
				.ignoring(StaleElementReferenceException.class);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(by);
			}
		});
	}

	public static void waitForStalenessOfElement(final By by) {
		WebDriverWait wait = new WebDriverWait(webDriver, WAITING_TIME);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}

	public static void waitForVisibleElement(final By by) {
		WebDriverWait wait = new WebDriverWait(webDriver, WAITING_TIME);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void waitForClickableElement(final By by) {
		WebDriverWait wait = new WebDriverWait(webDriver, WAITING_TIME);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public static void waitForElementDisappear(final By by) {
		WebDriverWait wait = new WebDriverWait(webDriver, WAITING_TIME);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public static boolean waitUtilAtNextPage(String titlePage) {
		try {
			WebDriverWait wait = new WebDriverWait(webDriver, WAITING_TIME);
			wait.ignoring(TimeoutException.class).until(ExpectedConditions.titleContains(titlePage));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public static void type(By by, String text) {
		waitForElement(by);
		do {
			try {
				javascript_highlight(by, "blue", "dotted", 3);
				webDriver.findElement(by).clear();
				webDriver.findElement(by).sendKeys(text);
				break;
			} catch (StaleElementReferenceException e) {

			}
		} while (true);
	}

	public static void type(By by, Keys key) {
		webDriver.findElement(by).sendKeys(key);
	}

	public static void type(WebElement pageElement, Keys key) {
		pageElement.sendKeys(key);
	}

	public static void type(WebElement pageElement, String text) {
		do {
			try {
				pageElement.clear();
				pageElement.sendKeys(text);
				break;
			} catch (InvalidElementStateException e) {

			}
		} while (true);
	}

	public static void typeSlowly(WebElement pageElement, String text) {
		do {
			try {
				// javascript_highlight(pageElement, "blue", "dotted", 3);
				pageElement.clear();
				for (String letter : text.split("")) {
					pageElement.sendKeys(letter);
					Thread.sleep(150);
				}
				break;
			} catch (InvalidElementStateException | InterruptedException e) {

			}
		} while (true);
	}

	public static void typeSlowly(By by, String text) {
		waitForElement(by);
		do {
			try {
				javascript_highlight(by, "blue", "dotted", 3);
				webDriver.findElement(by).clear();
				for (String letter : text.split("")) {
					webDriver.findElement(by).sendKeys(letter);
					Thread.sleep(150);
				}
				break;
			} catch (StaleElementReferenceException | InterruptedException e) {

			}
		} while (true);
	}

	public static void click(By by) {
		waitForElement(by);
		javascript_highlight(by, "blue", "dotted", 3);
		javaClick(by);
	}

	public static void doubleClick(By by) {
		waitForElement(by);
		javascript_highlight(by, "blue", "dotted", 3);
		javaDoubleClick(by);
	}

	public static void javaScrollIntoView(By by) {
		JavascriptExecutor executor = (JavascriptExecutor) webDriver;
		executor.executeScript("arguments[0].scrollIntoView();", webDriver.findElement(by));
	}

	public static void javaClick(By by) {
		JavascriptExecutor executor = (JavascriptExecutor) webDriver;
		executor.executeScript("arguments[0].click();", webDriver.findElement(by));
	}

	public static void javaDoubleClick(By by) {
		JavascriptExecutor executor = (JavascriptExecutor) webDriver;
		executor.executeScript(
				"var event = new MouseEvent('dblclick', { 'view': window,  'bubbles': true,    'cancelable': true  }); arguments[0].dispatchEvent(event)",
				webDriver.findElement(by));
	}

	public static void javaClick(WebElement pageElement) {
		JavascriptExecutor executor = (JavascriptExecutor) webDriver;
		executor.executeScript("arguments[0].click();", pageElement);
	}

	public static void actionClick(By by) {
		Actions actions = new Actions(webDriver);
		actions.moveToElement(webDriver.findElement(by)).click();
		actions.perform();
	}

	public static void actionClick(WebElement element) {
		Actions actions = new Actions(webDriver);
		actions.moveToElement(element).click();
		actions.perform();
	}

	public static void actionMove(By by) {
		Actions actions = new Actions(webDriver);
		actions.moveToElement(webDriver.findElement(by));
		actions.perform();
	}

	public static boolean isDisplayed(By by) {
		try {
			waitForVisibleElement(by);
			javascript_highlight(by, "green", "dotted", 3);
			boolean diplayed = webDriver.findElement(by).isDisplayed();
			return diplayed;
		} catch (NoSuchElementException | TimeoutException e) {
			return false;
		}
	}

	public static String getProperty(String location, String property) {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(location);

			// load a properties file
			prop.load(input);

			return prop.getProperty(property);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "";
	}

	public static boolean isContainsText(By by, String text) {
		javascript_highlight(by, "green", "dotted", 3);
		return webDriver.findElement(by).getText().contains(text);
	}

	public static boolean isContainsValue(By by, String text) {
		javascript_highlight(by, "green", "dotted", 3);
		return webDriver.findElement(by).getAttribute("value").contains(text);
	}

	public static boolean isEqualText(By by, String text) {
		javascript_highlight(by, "green", "dotted", 3);
		return webDriver.findElement(by).getText().equals(text);
	}

	public static boolean isEqualValue(By by, String text) {
		javascript_highlight(by, "green", "dotted", 3);
		return webDriver.findElement(by).getAttribute("value").equals(text);
	}

	public static boolean isChecked(By by, boolean expectedStatus) {
		javascript_highlight(by, "green", "dotted", 3);
		if (webDriver.findElement(by).isSelected() && expectedStatus)
			return true;
		else
			return false;
	}

}
