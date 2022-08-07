package com.ef.businesscard

import android.app.Application
import com.ef.businesscard.data.AppDatabase
import com.ef.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}