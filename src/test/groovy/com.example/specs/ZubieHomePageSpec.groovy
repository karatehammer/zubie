package com.example.specs

import com.example.pages.ZubieHomePage
import geb.spock.GebReportingSpec
import org.junit.Test


class ZubieHomePageSpec extends GebReportingSpec {


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone()
    }

    @Test
    def "Navigate to the Zubie Page"() {

        when:
        to ZubieHomePage

        then:
        assert ZubieHomePage.url.contains("zubie")
    }


    @Test
    def "Navigate to login"() {

        when:
        ZubieHomePage zubieHomePage = to ZubieHomePage

        then:
        zubieHomePage.loginLink.click()

        and: "Validate the the login page has loaded"
        browser.currentUrl.contains("my.zubie.co")
    }

}