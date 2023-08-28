/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//$(function () {
//    $('a').each(function () {
//        if ($(this).prop('href') === window.location.href) {
//            $(this).addClass('active');
//        }
//    });
//});

function decorateNavBar() {
    var home = document.getElementById("home");
    var find = document.getElementById("find");
    var about = document.getElementById("about");

    switch (window.location.href) {
        case find.href:
        {
            find.style.fontWeight = "700";
            break;
        }
        case about.href:
        {
            about.style.fontWeight = 700;
            break;
        }
        case home.href:
            home.style.fontWeight = 700;
            break;

        case "http://localhost:8080/MariaCafe/":
            home.style.fontWeight = 700;
            break;
        default :
            about.style.fontWeight = 700;
            break;
    }
}

function disableCurrentSplitPage() {
    var links = document.getElementById('page-number').getElementsByTagName('a');
    var found = false;
    for (var i = 0; i < links.length; i++) {
        if (links[i].href === window.location.href) {
            links[i].style.border = "1px solid gray";
            links[i].style.cursor = "default";
            links[i].style.pointerEvents = "none";
            found = true;
        }
    }
    if (!found) {
        links[0].style.border = "1px solid gray";
        links[0].style.cursor = "default";
        links[0].style.pointerEvents = "none";
    }
}