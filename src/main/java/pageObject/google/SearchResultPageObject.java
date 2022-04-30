package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchResultPageObject extends Base {
    public SearchResultPageObject(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = ".//div[@class='main']//a[contains(.,'Картинки')]")
    private WebElement imagesTab;

    public void assertImagesTabButtonIsExist() {

    }

    //Проверяем, что кнопка "Картинки" существует на странице
    public boolean isImagesTabButtonIsExist() {
        return waitVisibilityElement(imagesTab);

    }


    //Домашка
//Проверить что такой результат поиска есть
    @FindBy(xpath = "(//cite[contains(.,'https://ru.wikipedia.org')])[1]")
    private WebElement resultWiki;

    public void assertResultWikiButtonIsExist() {

    }

    //Проверяем, что результат википедии существует на странице
    public boolean isResultWikiButtonIsExist() {
        return waitVisibilityElement(resultWiki);

    }

    //Проверить что открылись рейсы
    @FindBy(xpath = ".//span[contains(.,'Рейсы')]")
    private WebElement resultAvia;

    public void assertResultAviaButtonIsExist() {

    }

    //Проверяем, что табличка "Рейсы" существует на странице
    public boolean isResultAviaButtonIsExist() {
        return waitVisibilityElement(resultAvia);


    }
}
