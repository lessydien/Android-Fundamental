package id.majalengka.androidfundamental.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.majalengka.androidfundamental.data.MainRepository
import id.majalengka.androidfundamental.model.ResultResponse
import id.majalengka.androidfundamental.utils.Result
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: MainRepository): ViewModel() {

    val _data = MutableLiveData<Result<ResultResponse>>()
    val data: LiveData<Result<ResultResponse>> get() = _data
}