package com.example.virtual_plant_pet.navigation.navUtils

import com.example.solus.navigation.navUtils.navScreens
import com.example.virtual_plant_pet.R


data class bottomNavigationdata(
    val icon: Int = R.drawable.gardenniwa,
    val label: String = "",
    val route: String = ""
) {
    fun bottomNavigationItems(): List<bottomNavigationdata> {
        return listOf(
            bottomNavigationdata(
                icon = R.drawable.wildniwa, label = "Wild",
                navScreens.HomeScreen.route
            ),
            bottomNavigationdata(
                icon = R.drawable.gardenniwa,
                label = "Garden",
                navScreens.ProfileScreen.route
            ),
            bottomNavigationdata(
                icon = R.drawable.plantnawai, label = "Plant",
                navScreens.FeedScreen.route
            )

        )
    }
}
