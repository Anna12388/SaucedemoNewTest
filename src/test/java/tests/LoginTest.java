package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest{

    @Test
    public void loginUserWithValidData(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");

        assertTrue(inventoryPage.titleIsVisible());
    }
    @Test
    public void userNameShouldBeRequired(){
        loginPage.open();
        loginPage.login("","secret_sauce");

        assertEquals(loginPage.getErrorMessage(),"Epic sadface: Username is required", "Текст сообщения неверный");
    }
    @Test
    public void leavePasswordFieldEmpty(){
        loginPage.open();
        loginPage.login("standard_user","");

        assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required", "Текст сообщения неверный или отсутствует");
    }
    public void lockedOutUser(){
        loginPage.open();
        loginPage.login("locked_out_user","secret_sauce");

        assertEquals(loginPage.getErrorMessage(),"Epic sadface: Sorry, this user has been locked out","Текст сообщения неверный или отсутствует");
    }
}
