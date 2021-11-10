package com.example.android.politicalpreparedness.election

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.politicalpreparedness.network.CivicsApi
import kotlinx.coroutines.launch

//TODO: Construct ViewModel and provide election datasource
class ElectionsViewModel() : ViewModel() {


    //TODO: Create live data val for upcoming elections
    private val _elections = MutableLiveData<String>()
    val elections: LiveData<String> = _elections

    init {
        getElectionResponse()
    }

    //TODO: Create live data val for saved elections

    //TODO: Create val and functions to populate live data for upcoming elections from the API and saved elections from local database
    private fun getElectionResponse() {
        viewModelScope.launch {
            val listResult = CivicsApi.retrofitService.getElections()
            _elections.value = "${listResult.size}"
        }
    }
    //TODO: Create functions to navigate to saved or upcoming election voter info

}