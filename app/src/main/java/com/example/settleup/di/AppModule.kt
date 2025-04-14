package com.example.settleup.di

import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule=module {

    //firbase
    single { Firebase.auth }

    //firestore
    single { Firebase.firestore }

    //viewModels
    viewModel { AuthViewModel (get())} //passing firebase
    viewModel {ExpenseViewModel(get())}  //if oyu need firestore


}