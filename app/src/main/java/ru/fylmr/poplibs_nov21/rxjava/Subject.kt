package ru.fylmr.poplibs_nov21.rxjava

import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.PublishSubject
import java.util.concurrent.TimeUnit

//fun publishSubject() = PublishSubject.create<String>().apply {
//    Observable.timer(2, TimeUnit.SECONDS)
//        .subscribe {
//            onNext("Value from observable")
//        }
//}
//
//fun subscribeToSubject() {
//    val subject = publishSubject()
//    subject.subscribe {
//        Log.d("Subject", "Subject result: $it")
//    }
//
//    Observable.timer(3, TimeUnit.SECONDS)
//        .subscribe {
//            subject.onNext("Another value")
//        }
//}