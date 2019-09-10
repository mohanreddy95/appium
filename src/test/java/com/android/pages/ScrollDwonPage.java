package com.android.pages;

import org.openqa.selenium.Dimension;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
public class ScrollDwonPage extends WebDriverTestBase{
	@SuppressWarnings("all")
	public AndroidDriver getAndroidDriver() {
	    AndroidDriver  driver = (AndroidDriver)getDriver().getUnderLayingDriver();
	    return driver;
	}
	        
	      public  void scrollVertical()
	      {
	          Dimension size=getAndroidDriver().manage().window().getSize();
	        
	          int startXpoint=size.getWidth()/2;
	          int startYpoint=size.getHeight()/2;
	          int endXpoint=startXpoint;
	          int endYpoint=(int)(startYpoint*0.300);
	          AndroidTouchAction touch=new AndroidTouchAction(getAndroidDriver());
	          touch.longPress(PointOption.point(startXpoint,startYpoint)).moveTo(PointOption.point(endXpoint, endYpoint)).release().perform();
	      }
	      public void performScrolling(QAFWebElement element) {
	          while (element.verifyNotPresent()) {
	        	  ScrollDwonPage scroll=new ScrollDwonPage();
	              scroll.scrollVertical();
	              if (element.isPresent()) {
	                  element.click();
	                  break;
	              }
	          }
	      }
}
