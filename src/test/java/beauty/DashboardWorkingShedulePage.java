package beauty;

import common.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static org.junit.Assert.fail;

public class DashboardWorkingShedulePage extends Page {
    private final By sunday = By.xpath("/html/body/div[1]/app-root/app-provider-layout/div/div/app-schedules/div[2]/div/div/div/ng-fullcalendar/div[2]/div/table/tbody/tr/td/div/div/div[2]/table/tbody/tr[6]/td[2]");

    public DashboardWorkingShedulePage(WebDriver driver) {
        super(driver);
    }

    public void myShedule(Weekday weekDay, String timeEnd){
        WebElement elem = driver.findElement(sunday);
        //click on coordinates
        Actions builder = new Actions(driver);
        builder.moveToElement(elem , weekDay.offsetX, 0).click().build().perform();
        //click(sunday);

        //copy
        StringSelection ss = new StringSelection(timeEnd);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        try {
            Robot robot = new Robot();
            //paste
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            sleep(1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
        catch(AWTException e){
            e.printStackTrace();
            fail(e.getMessage());
        }
    }


}