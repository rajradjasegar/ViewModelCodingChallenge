package raj.training.viewmodelcodingchallenge3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel (startingTotal: Int) : ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
        get() = total

    var addValue = MutableLiveData<String>()

    init {
        total.value = startingTotal
    }

    fun setTotal() {
        val inputInt : Int = addValue.value!!.toInt()
        total.value = (total.value)?.plus(inputInt)
    }
}