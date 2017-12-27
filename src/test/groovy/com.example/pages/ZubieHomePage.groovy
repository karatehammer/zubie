package com.example.pages

import geb.Page

class ZubieHomePage extends Page{

    static url = "http://zubie.com"
    static resolvesTo = "zubie.com"

    static at = { title.contains("Zubie")}

    static content = {
        //searchBar {$('id[lst-ib]')}
    }

}
