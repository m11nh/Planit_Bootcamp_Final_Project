package com.airbnb.tests;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
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
        this.driver = new FirefoxDriver(options); 

<<<<<<< HEAD
        this.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
=======
        // 2. Set implicit wait
        this.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); //config
>>>>>>> 221689f6af5f6a20e724deab28480b2bcb39f1b0

        this.driver.manage().window().maximize();

        this.driver.get("https://www.airbnb.com.au/"); 
    }

    @AfterEach
    public void shutdown() {
        this.driver.quit();
    }

    public <T> T open(Class<T> c) {
        try {
            return c.getConstructor(WebDriver.class).newInstance(this.driver);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 221689f6af5f6a20e724deab28480b2bcb39f1b0
