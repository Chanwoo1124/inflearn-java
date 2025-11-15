package collection.Map.test.Stack;

import java.util.spi.AbstractResourceBundleProvider;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("fackbook.com");

        String s = browser.goBock();
        System.out.println(s);
        String s1 = browser.goBock();
        System.out.println(s);
    }
}
