package com.example.ffnews.presentation.onboarding

sealed class OnBoardingEvent {
    data object SaveAppEntry: OnBoardingEvent()
}