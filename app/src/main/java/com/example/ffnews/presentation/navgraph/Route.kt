package com.example.ffnews.presentation.navgraph

sealed class Route(
    val route: String
){
    data object OnBoardingScreen: Route("onBoardingScreen")
    data object HomeScreen: Route("homeScreen")
    data object SearchScreen: Route("searchScreen")
    data object BookmarkScreen: Route("bookmarkScreen")
    data object DetailsScreen: Route("detailsScreen")

    data object AppStartNavigation: Route("appStartNavigation")
    data object NewsNavigation: Route("NewsNavigation")
    data object NewsNavigatorScreen: Route("newsNavigator")


}