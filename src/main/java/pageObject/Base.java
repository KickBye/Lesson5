package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    private WebDriver driver;
//переменная для ожидания
    protected final int driverWaitTime =10;
//
    public  Base(final WebDriver driver){
        //загружает статический класс из библиотеки селениума
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }


    public WebDriver getDriver(){
        return driver;
    }

    //клик по элементу
    public void click(final WebElement element){
        //динамическое ожидание
        waitVisibilityElement(element);
        //клик
        element.click();
    }

    //передача текста в элемент
    public void setText(final WebElement element,final String text){
      //динамическое ожидание
        waitVisibilityElement(element);
        //передача текста
        element.sendKeys(text);
    }

    //получение текста элемента
    public String getText(final WebElement element){
        //Динамическое ожидание
        waitVisibilityElement(element);
        //получаем текст
        return element.getText();
    }






    public Boolean waitVisibilityElement(final WebElement element){
//получает на вход драйвер, ждет 10 секунд пока не появится элемент
        WebDriverWait wait = new WebDriverWait(driver,driverWaitTime);
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    //перегрузка, тоже самое что сверху, по разному получает данные на вход
    public Boolean waitVisibilityElement(final WebElement element, final int sec){
        WebDriverWait wait = new WebDriverWait(driver,sec);
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }


    //Домашка

    //передача текста в элемент
    public void setText2(final WebElement element2,final String text2){
        //динамическое ожидание
        waitVisibilityElement(element2);
        //передача текста
        element2.sendKeys(text2);
    }

}
