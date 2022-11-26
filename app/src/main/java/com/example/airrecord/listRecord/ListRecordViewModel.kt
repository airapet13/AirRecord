package com.example.airrecord.listRecord

import androidx.lifecycle.ViewModel
import com.example.airrecord.database.RecordDatabaseDao

class ListRecordViewModel(dataSource: RecordDatabaseDao) : ViewModel() {

    val database = dataSource
    val records = database.getAllRecords()
}