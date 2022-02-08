//package ru.fylmr.poplibs_nov21.rxjava
//
//import android.util.Log
//import io.reactivex.rxjava3.core.Flowable
//import io.reactivex.rxjava3.core.Observable
//import io.reactivex.rxjava3.schedulers.Schedulers
//
//class NoBackPressure {
//
//    private fun producer() = Observable.range(0, 100_000_000)
//        .subscribeOn(Schedulers.io())
//
//    fun exec() {
//        producer()
//            .observeOn(Schedulers.computation())
//            .subscribe({
//                Thread.sleep(200)
//                Log.d("BackPressure", "Result handled")
//            },
//                {
//                    Log.e("BackPressure", "Error", it)
//                })
//    }
//}
//
//class BackPressure {
//
//    private fun producer() = Flowable.range(0, 100_000_000)
//        .subscribeOn(Schedulers.io())
//        .onBackpressureBuffer()
//
//    fun exec() {
//        producer()
//            .observeOn(Schedulers.computation(), false, 1)
//            .subscribe({
//                Thread.sleep(1000)
//                Log.d("BackPressure", "Result handled: $it")
//            },
//                {
//                    Log.e("BackPressure", "Error", it)
//                })
//    }
//}