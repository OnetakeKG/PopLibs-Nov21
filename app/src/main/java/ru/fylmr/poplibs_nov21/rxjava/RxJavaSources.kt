package ru.fylmr.poplibs_nov21.rxjava

import android.util.Log
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Single
import kotlin.random.Random

//fun randomResultOperation(): Boolean {
//    Thread.sleep(Random.nextLong(1000))
//    return listOf(true, false).random()
//}
//
//// ===========================================================
//// Completable
//// ===========================================================
//
//fun completable() = Completable.create { emitter ->
//    val result = randomResultOperation()
//    if (result) {
//        emitter.onComplete()
//    } else {
//        emitter.onError(RuntimeException("Completable Error"))
//    }
//}
//
//fun subscribeToCompletable() {
//    completable().subscribe(
//        {
//            Log.d("Completable", "Successful completable run")
//        },
//        {
//            Log.e("Completable", "Error", it)
//        }
//    )
//}
//
//// ===========================================================
//// Single
//// ===========================================================
//
//fun single() = Single.fromCallable {
//    randomResultOperation()
//}
//
//fun subscribeToSingle() {
//    single().subscribe(
//        {
//            Log.d("Single", "Successful single: $it")
//        }, {
//            Log.e("Single", "Error running single", it)
//        }
//    )
//}
//
//// ===========================================================
//// Maybe
//// ===========================================================
//
//fun maybe() = Maybe.create<Int> { emitter ->
//    val randomInt = Random.nextInt()
//    when (randomInt.mod(3)) {
//        0 -> emitter.onSuccess(randomInt)
//        1 -> emitter.onComplete()
//        2 -> emitter.onError(RuntimeException("$randomInt mod 3 == 2"))
//    }
//}
//
//fun subscribeToMaybe() {
//    maybe().subscribe(
//        {
//            Log.d("Maybe", "Successful maybe: $it")
//        },
//        {
//            Log.e("Maybe", "Error maybe: $it")
//        },
//        {
//            Log.d("Maybe", "Completed maybe")
//        }
//    )
//}