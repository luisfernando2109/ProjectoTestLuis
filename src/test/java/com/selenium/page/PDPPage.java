package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.config.BaseConfig;

public class PDPPage extends BaseConfig {

	public PDPPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Create Element
	@FindBy(xpath = "(//*[@class ='addToCartButtonDiv'])")
	private WebElement addcartbutton;

	// Create Element
	@FindBy(xpath = "(//div[@class ='btn-addToCart col-xs-12 col-md-3 pull-right btn-red'])")
	private WebElement gotocartBtn;

	// creamos nuestro metodo agregar al carro
    public void clickAddToCart() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(addcartbutton));
        addcartbutton.click();
    }

    // creamos nuestro metodo ir al carro
    public CartPage clickGoToCart() {
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(gotocartBtn));
        action.moveToElement(gotocartBtn).click().perform();
        return new CartPage(driver);
    }

}
