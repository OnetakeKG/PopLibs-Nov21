//package ru.fylmr.poplibs_nov21.rxjava
//
//import android.util.Log
//import io.reactivex.rxjava3.core.Observable
//
//fun errorSingle() = Observable.create<Boolean> {
//    val random = listOf(true, false).random()
//    if (random) {
//        Log.d("Handling", "returning true")
//        it.onNext(random)
//    } else {
//        Log.d("Handling", "returning false")
//        it.onError(IllegalStateException("Illegal state"))
//    }
//}
//
//fun onErrorReturnExample() {
//    errorSingle()
//        .onErrorReturn {
//            false
//        }
//        .subscribe { bool ->
//            Log.d("Error Handling", "Subscribe: $bool")
//        }
//}
//
//fun onErrorReturnNextExample() {
//    errorSingle()
//        .onErrorResumeNext {
//            errorSingle()
//        }
//        .subscribe { bool ->
//            Log.d("Error Handling", "Subscribe: $bool")
//        }
//}
//
//fun onErrorRetryExample() {
//    errorSingle()
//        .retry(5)
//        .subscribe { bool ->
//            Log.d("Error Handling", "Subscribe: $bool")
//        }
//}