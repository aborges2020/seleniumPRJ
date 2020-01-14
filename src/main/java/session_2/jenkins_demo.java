package session_2;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class jenkins_demo
{

    @Test
    void publicvoidtestgooglrsearch(){

        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.in");

        String Expectedtitle = "Google";

        String Actualtitle = driver.getTitle();
        System.out.println("Before Assetion " + Expectedtitle + Actualtitle);

        Assert.assertEquals(Actualtitle, Expectedtitle);

        System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
    }

}