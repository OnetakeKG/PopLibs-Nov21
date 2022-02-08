//package ru.fylmr.poplibs_nov21.rxjava
//
//import android.util.Log
//import io.reactivex.rxjava3.core.Observable
//import java.util.concurrent.TimeUnit
//
//// ===========================================================
//// Publish
//// ===========================================================
//
//fun hotObservablePublish() =
//    Observable.interval(1, TimeUnit.SECONDS)
//        .publish()
//
//fun executeHotObservablePublish() {
//    val hotObservable = hotObservablePublish()
//
//    hotObservable.subscribe {
//        Log.d("Hot", "Hot observable: $it")
//    }
//
//    hotObservable.connect()
//
//    Thread.sleep(3000)
//
//    hotObservable.subscribe {
//        Log.d("Hot", "Hot observable delayed: $it")
//    }
//}
//
//// ===========================================================
//// Replay
//// ===========================================================
//
//fun hotObservableReplay() =
//    Observable.interval(1, TimeUnit.SECONDS)
//        .replay()
//
//fun executeHotObservableReplay() {
//    val hotObservable = hotObservableReplay()
//
//    hotObservable.subscribe {
//        Log.d("Hot", "Hot observable: $it")
//    }
//
//    hotObservable.connect()
//
//    Thread.sleep(3000)
//
//    hotObservable.subscribe {
//        Log.d("Hot", "Hot observable delayed: $it")
//    }
//}
//
//// ===========================================================
//// RefCount
//// ===========================================================
//
//fun hotObservableRefCount() =
//    Observable.interval(1, TimeUnit.SECONDS)
//        .publish()
//        .refCount()
//
//fun executeHotObservableRefCount() {
//    val hotObservable = hotObservableRefCount()
//
//    hotObservable.subscribe {
//        Log.d("Hot", "Hot observable: $it")
//    }
//
//    Thread.sleep(3000)
//
//    hotObservable.subscribe {
//        Log.d("Hot", "Hot observable delayed: $it")
//    }
//}
//
//// ===========================================================
//// Cache
//// ===========================================================
//
//fun hotObservableCache() = hotObservableRefCount()
//    .cache()
//
//fun executeHotObservableCache() {
//    val hotObservable = hotObservableCache()
//
//    hotObservable.subscribe {
//        Log.d("Hot", "Hot observable: $it")
//    }
//
//    Thread.sleep(3000)
//
//    hotObservable.subscribe {
//        Log.d("Hot", "Hot observable delayed: $it")
//    }
//}
