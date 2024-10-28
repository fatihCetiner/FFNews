package com.example.ffnews.presentation.navgraph

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.ffnews.presentation.home.HomeScreen
import com.example.ffnews.presentation.home.HomeViewModel
import com.example.ffnews.presentation.onboarding.OnBoardingScreen
import com.example.ffnews.presentation.onboarding.OnBoardingViewModel
import com.example.ffnews.presentation.search.SearchScreen
import com.example.ffnews.presentation.search.SearchViewModel

@Composable
fun NavGraph(
    startDestination: String,
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {

        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(
                route = Route.OnBoardingScreen.route
            ){
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }

        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigatorScreen.route
        ){
            composable(
                route = Route.NewsNavigatorScreen.route
            ){
                val viewModel: SearchViewModel = hiltViewModel()
                SearchScreen(
                    state = viewModel.state.value,
                    event = viewModel::onEvent,
                    navigate = {}
                )
            }
        }

    }

}