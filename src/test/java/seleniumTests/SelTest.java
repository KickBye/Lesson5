package seleniumTests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.google.InitPageObject;
import pageObject.google.SearchResultPageObject;

public class SelTest extends BaseTest{
    @Test
    public void startTest(){

        //куда перейдем на страничку
        getDriver().get("https://www.google.ru/");

        //развернет драйвер во весь экран
        getDriver().manage().window().maximize();

        //
        InitPageObject in = new InitPageObject(getDriver());

        //Передача текста
        in.setSearchText("Привет");

        //клик по кнопке поиска
        in.clickSubmitsSearch();



//Проверка
        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
        Assertion as=new Assertion();
        as.assertTrue(sr.isImagesTabButtonIsExist());

        //Домашка


        //куда перейдем на страничку
        getDriver().get("https://www.google.ru/");

        //Передача текста
        in.setSearchText2("Википедия");

        //клик по первому результату поиска
        in.clickSubmitsSearch2();


        //Проверка ссылки на википедию
        SearchResultPageObject sr2 = new SearchResultPageObject(getDriver());
        Assertion as2=new Assertion();
        as2.assertTrue(sr2.isResultWikiButtonIsExist());


        //клик по кнопке "Ещё"
        in.clickSubmitsSearch3();


        //клик по кнопке "авиабилеты"
        in.clickSubmitsSearch4();



        //Проверка оторбражения "Рейсы
        SearchResultPageObject sr3 = new SearchResultPageObject(getDriver());
        Assertion as3=new Assertion();
        as3.assertTrue(sr3.isResultAviaButtonIsExist());




    }

}
