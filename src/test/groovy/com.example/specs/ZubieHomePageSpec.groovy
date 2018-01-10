package com.example.specs

import com.example.pages.GoogleHomePage
import geb.spock.GebReportingSpec
import org.junit.Test



class ZubieHomePageSpec extends GebReportingSpec {

    @Test
    def "Navigate to the Zubie Page"() {

        when:
        to GoogleHomePage

        then:
        to GoogleHomePage

    }

//    @Test
//    def "Navigate to login"() {
//
//        when:
//        ZubieHomePage zubieHomePage = to ZubieHomePage
//
//        then:
//        zubieHomePage.loginLink.click()
//
//        and: "Validate the the login page has loaded"
//        browser.currentUrl.contains("my.zubie.co")
//    }

}