package com.luismakeapp.mvvmsimple.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.luismakeapp.mvvmsimple.data.allWords
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MVVMViewModel: ViewModel(){

    private val _uiState = MutableStateFlow(MVVMUiState())
    val uiState: StateFlow<MVVMUiState> = _uiState.asStateFlow()

    val words = allWords
    var positionWord = 0

    init {
        //Coroutines
        _uiState.update { currentState ->
            currentState.copy(
                word = words.elementAt(positionWord)
            )
        }
    }

    fun nextWord(){
        if(positionWord < (words.size-1)){
            positionWord++
        }

        //Coroutines
        _uiState.update { currentState ->
            currentState.copy(
                word = words.elementAt(positionWord)
            )
        }
    }

    fun previousWord(){

        if(positionWord > 0){
            positionWord--
        }

        //Coroutines
        _uiState.update { currentState ->
            currentState.copy(
                word = words.elementAt(positionWord)
            )
        }
    }
}