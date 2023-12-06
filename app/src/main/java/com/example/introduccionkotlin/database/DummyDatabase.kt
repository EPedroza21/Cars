package com.example.introduccionkotlin.database

import com.example.introduccionkotlin.model.Car
import com.example.introduccionkotlin.model.Models

class DummyDatabase {

    companion object{
        val database = mutableListOf(
            Car(
                "Serie 3",
                "BMW",
                2006,
                "https://www.google.com/search?client=firefox-b-1-d&sca_esv=587474982&sxsrf=AM9HkKm07kio1VuhENjES76Omhgc-ceWNg:1701613828399&q=bmw+m3+e46+2006&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiMgKW-vfOCAxXbj2oFHe8CBTQQ0pQJegQIDBAB&biw=1536&bih=703&dpr=1.25#imgrc=H-388WSflY4TDM",
                listOf(
                    Models(
                        "M3", "330i", "320i"
                    )
                )
            ),
            Car(
                "WRX",
                "Subaru",
                2014,
                "https://www.google.com/search?client=firefox-b-1-d&sca_esv=587474982&sxsrf=AM9HkKmbFjP8WzFTrSN676xLnB68eqwqfg:1701613943811&q=wrx+sti+2014&tbm=isch&source=lnms&sa=X&ved=2ahUKEwjbsqn1vfOCAxXVhu4BHatZASoQ0pQJegQIDhAB&biw=1536&bih=703&dpr=1.25#imgrc=dRi9Zt66P7sofM",
                listOf(
                    Models(
                        "STI", "Sport", "Impreza"
                    )
                )
            ),
            Car(
                "GT3",
                "Porsche",
                2023,
                "https://www.google.com/search?client=firefox-b-1-d&sca_esv=587474982&sxsrf=AM9HkKnqt8STAqNuIoF65n6Lpjn5YQg6Pw:1701613995907&q=gt3+rs+2023&tbm=isch&source=lnms&sa=X&ved=2ahUKEwjGgJWOvvOCAxWALkQIHRe6BwkQ0pQJegQIChAB&biw=1536&bih=703&dpr=1.25#imgrc=KXImCAo7mqee5M",
                listOf(
                    Models(
                        "RS", "912", "911"
                    )
                )
            ),
            Car(
                "Leon",
                "Cupra",
                2021,
                "https://www.google.com/search?q=cupra+leon&tbm=isch&ved=2ahUKEwjKrcenvvOCAxVjrIkEHVwwA9cQ2-cCegQIABAA&oq=cupra+leon&gs_lcp=CgNpbWcQAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BAgjECc6CggAEIAEEIoFEENQ9wNYnw1g7hNoAHAAeACAAVOIAaIDkgEBNpgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=4ZFsZYq5CePYptQP3OCMuA0&bih=703&biw=1536&client=firefox-b-1-d#imgrc=W4ugQaFoJMd_ZM",
                listOf(
                    Models(
                        "Premium", "Medium", "Basic"
                    )
                )
            ),
            Car(
                "BRZ",
                "Subaru",
                2021,
                "https://www.google.com/search?client=firefox-b-1-d&sca_esv=587474982&sxsrf=AM9HkKnWJwlnbEaUAr_J0EXJsdFBKzCUOA:1701614091725&q=brz+subaru&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiMne27vvOCAxXKOUQIHZejDSUQ0pQJegQICRAB&biw=1536&bih=703&dpr=1.25#imgrc=t1HKqFfvnzC0JM",
                listOf(
                    Models(
                        "STI", "Sport", "CVT"
                    )
                )
            )
        )
    }
}

