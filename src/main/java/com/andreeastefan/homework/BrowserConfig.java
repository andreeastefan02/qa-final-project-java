package com.andreeastefan.homework;

public class BrowserConfig {
    BrowserType browser;
    String version;
    Boolean isHeadless;

    public BrowserConfig(BrowserType browser, String version, Boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    public BrowserConfig(BrowserType browser) {
        this(browser, "latest");
    }

    public static BrowserConfig createDefaultChromeConfig(){
         return new BrowserConfig(BrowserType.CHROME,"latest", true);
        }



    public void afiseazaConfig() {
        System.out.println(
                "Details: " +
                        "\n - BROWSER: " + this.browser +
                        "\n - VERSION: " + this.version +
                        "\n - HEADLESS: " + this.isHeadless
        );

    }
}

