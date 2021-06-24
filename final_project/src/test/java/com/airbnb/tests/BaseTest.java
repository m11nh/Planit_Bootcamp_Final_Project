package com.airbnb.tests;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

@Execution(ExecutionMode.CONCURRENT)
public abstract class BaseTest {
    
    protected WebDriver driver;

    @BeforeEach
    public void setup() throws MalformedURLException {
        var options = new FirefoxOptions();
        this.driver = new FirefoxDriver(options); //config

        // 2. Set implicit wait
        this.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //config

        // 3. Maximize
        this.driver.manage().window().maximize();

        // 4. Nav home
        this.driver.get("https://www.airbnb.com.au/"); //config
    }

    @AfterEach
    public void shutdown() {
        // 5. Close browser
        this.driver.quit();
    }

    public <T> T open(Class<T> clazz) {
        try {
            return clazz.getConstructor(WebDriver.class).newInstance(this.driver);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
// foname, email, message