package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class InitPageObject extends Base{
    public InitPageObject(WebDriver driver) {
        super(driver);
    }


    //поиск элемента по Xpath
    @FindBy(xpath=".//input[@title='Поиск']")
    private WebElement searchText;


    //поиск элемента по Xpath
    @FindBy(xpath="(.//input[@value='Поиск в Google'])[1]")
    //элемент по которому кликнем
    private WebElement submitSearch;


//Вводим текст в строку поиска param text
    public void setSearchText(String text){
        setText(searchText, text);
    }

    //кликаем по элементу
    public void clickSubmitsSearch() {
        click(submitSearch);
    }


    public void setAndClick(String text){
        setSearchText(text);
        clickSubmitsSearch();


    }


    //Домашка
//строка поиска
    @FindBy(xpath="//input[@aria-label='Найти']")
    private WebElement searchText2;

    //Вводим текст в строку Википедия
    public void setSearchText2(String text2){
        setText(searchText2, text2);
    }


    //кнопка выбора из выпадающего списка первый результат
    @FindBy(xpath="(//span[contains(.,'википедия')])[1]")
    //элемент по которому кликнем
    private WebElement submitSearch2;



    //кликаем по первому результату вики
    public void clickSubmitsSearch2() {
        click(submitSearch2);
    }






    //Кликнуть кнопку "Ещё"
    @FindBy(xpath="(.//span[contains(.,'Ещё')])[1]")
    //элемент по которому кликнем
    private WebElement submitSearch3;

    //кликаем по кнопке "еще"
    public void clickSubmitsSearch3() {
        click(submitSearch3);
    }



    //Кликнуть в выпадающем списке "Авиабилеты
    @FindBy(xpath="(//g-menu-item)[14]")
    //элемент по которому кликнем
    private WebElement submitSearch4;

    //кликаем по авиабилетам
    public void clickSubmitsSearch4() {
        click(submitSearch4);
    }






}
