package com.testing.stepDef;

import com.testing.pageObjects.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Steps {

HomePage homePage = new HomePage();
SignInPage signInPage = new SignInPage();
MyAccountPage myAccountPage = new MyAccountPage();
ContactUsPage contactUsPage = new ContactUsPage();
ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
SearchProductPage searchProductPage = new SearchProductPage();
WomenPage womenPage = new WomenPage();
DressesPage dressesPage = new DressesPage();
TShirtsPage tShirtsPage = new TShirtsPage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {
        String onHomePage = homePage.isOnHomePage( );
        Assert.assertEquals("http://automationpractice.com/index.php",onHomePage);

    }

    @When("^user selects sign-in link$")
    public void user_selects_sign_in_link()  {
        homePage.selectSignInLink();

    }

    @Then("^user should navigate to sign-in page$")
    public void user_should_navigate_to_sign_in_page()  {
        String onSignInPage = signInPage.isOnSignInPage( );
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account",onSignInPage);


    }

    @When("^enters email address$")
    public void enters_email_address()  {
        signInPage.emailAddress("renumahesh2006@gmail.com");



    }
    @And("^selects create an account$")
    public void selects_create_an_account()  {
        signInPage.createAnAccount();

    }

    @And("^enters all personal information$")
    public void enters_all_personal_information()  {
        signInPage.title();
        signInPage.personalFirstName("Vinaya");
        signInPage.personalLastName("M");
        signInPage.password("ilford123");
        signInPage.dateOfBirth();
        signInPage.checkBox();
        signInPage.address("Teal Lane");
        signInPage.city("Wheeling");
        signInPage.state();
        signInPage.zip("60090");
        signInPage.country();
        signInPage.mobile("+13095318765");
        signInPage.addressAlias("Teal Lane");
    }

    @And("^selects register$")
    public void selects_register() {
        signInPage.register();

    }

    @Then("^user should navigate to his account page$")
    public void user_should_navigate_to_his_account_page()  {
        String onMyAcountPage = myAccountPage.isOnMyAcountPage( );
        Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account",onMyAcountPage);


        String s = myAccountPage.welcomeMessage( );
        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",s);

        myAccountPage.signOut();

    }
    //////////////////////////////////////////////////////////////////////////////

    @When("^enters all valid credentils$")
    public void enters_all_valid_credentils()  {
        signInPage.signIn("renumahesh2006@gmail.com","ilford123");

    }

   @Then("^user should successfully sign-in into his account$")
    public void user_should_successfully_sign_in_into_his_account()  {
        String s = myAccountPage.welcomeMessage( );
        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",s);
    }
    //////////////////////////////////////////////////////////////////////////////

    @When("^user selects contact us link$")
    public void user_selects_contact_us_link(){
        contactUsPage.selectContactUsLink();


    }

    @Then("^user should navigate to contact us page$")
    public void user_should_navigate_to_contact_us_page()  {
        String onContactUsPage = contactUsPage.isOnContactUsPage( );
        Assert.assertEquals("http://automationpractice.com/index.php?controller=contact",onContactUsPage);


    }

    @When("^user enters all fields$")
    public void user_enters_all_fields() {
        contactUsPage.subjectHeading();
        contactUsPage.emailAddress("renumahesh2006@gmail.com");
        contactUsPage.orderReference("111");
        contactUsPage.attachFile();
        contactUsPage.message("Excellent product!!!");

    }

    @And("^selects send link$")
    public void selects_send_link()  {
        contactUsPage.selectSendButton();

    }

    @Then("^user should see the confirmation message$")
    public void user_should_see_the_confirmation_message() {
        String s = contactUsPage.confirmationMessage( );
        Assert.assertEquals("Your message has been successfully sent to our team.",s);

    }
    //////////////////////////////////////////////////////////////////////////////

    @When("^user selects cart link$")
    public void user_selects_cart_link() {
        shoppingCartPage.selectCartLink();


    }

    @Then("^user should view his shopping cart$")
    public void user_should_view_his_shopping_cart()  {
        String onCartPage = shoppingCartPage.isOnCartPage( );
        Assert.assertEquals("http://automationpractice.com/index.php?controller=order",onCartPage);

        String s = shoppingCartPage.cartSummary( );
        Assert.assertEquals("Your shopping cart is empty.",s);

    }
    //////////////////////////////////////////////////////////////////////////////

    @When("^user searches product$")
    public void user_searches_product()  {
        searchProductPage.search("Dresses");


    }

    @Then("^user should navigate to products page$")
    public void user_should_navigate_to_products_page()  {
        String onProductPage = searchProductPage.isOnProductPage( );
        Assert.assertEquals("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=Dresses&submit_search=",onProductPage);

    }

    @Then("^user should view products in that page$")
    public void user_should_view_products_in_that_page(){
        String s = searchProductPage.viewProductCount( );
        Assert.assertEquals("7 results have been found.",s);

    }
    //////////////////////////////////////////////////////////////////////////////

    @When("^user selects WOMEN link$")
    public void user_selects_WOMEN_link()  {
        womenPage.selectWomenLink();

    }

    @Then("^user should naviagte to WOMEN page$")
    public void user_should_naviagte_to_WOMEN_page()  {
        String onWomenPage = womenPage.isOnWomenPage( );
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category",onWomenPage);

    }

    @Then("^user should view products of WOMEN page$")
    public void user_should_view_products_of_WOMEN_page()  {
        String s = womenPage.viewWomenCount( );
        Assert.assertEquals("There are 7 products.",s);

    }

    @When("^user selects DRESSES link$")
    public void user_selects_DRESSES_link() {
        dressesPage.selectDressesLink();

    }

    @Then("^user should naviagte to DRESSES page$")
    public void user_should_naviagte_to_DRESSES_page() {
        String onDressesPage = dressesPage.isOnDressesPage( );
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=8&controller=category",onDressesPage);

    }

    @Then("^user should view products of DRESSES page$")
    public void user_should_view_products_of_DRESSES_page()  {
        String s = dressesPage.viewDressCount( );
        Assert.assertEquals("There are 5 products.",s);

    }

    @When("^user selects T-SHIRTS link$")
    public void user_selects_T_SHIRTS_link()  {
        tShirtsPage.selectTShirtsPage();

    }

    @Then("^user should naviagte to T-SHIRTS page$")
    public void user_should_naviagte_to_T_SHIRTS_page()  {
        String onTShirtsPage = tShirtsPage.isOnTShirtsPage( );
        Assert.assertEquals("http://automationpractice.com/index.php?id_category=5&controller=category",onTShirtsPage);

    }

    @Then("^user should view products of T-SHIRTS page$")
    public void user_should_view_products_of_T_SHIRTS_page()  {
        String s = tShirtsPage.viewTShirtsCount( );
        Assert.assertEquals("There is 1 product.",s);

    }


}
