package com.example.specs

import com.example.pages.ZubieHomePage
import geb.spock.GebReportingSpec
import org.junit.Test


class ZubieHomePageSpec extends GebReportingSpec {

    @Test
    def "Navigate to the Google Home Page"() {

        when:
        to ZubieHomePage

        then:
        assert ZubieHomePage.url.contains("zubie")
    }

}