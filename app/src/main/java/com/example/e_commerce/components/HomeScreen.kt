package com.example.e_commerce.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {

    var selectedTab by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = { AppTopAppBar(title = "EZYDEALS", onAccountClick = { navController.navigate("profile") }) },
        bottomBar = { AppBottomNavigationBar(navController, selectedTab) { selectedTab = it } }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Text("This is the Home Screen")
        }
    }
}

