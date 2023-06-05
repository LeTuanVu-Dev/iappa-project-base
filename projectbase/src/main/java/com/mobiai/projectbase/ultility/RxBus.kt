package com.mobiai.projectbase.ultility

import android.database.Observable

/*
 * Singleton instance
 * A simple rx bus that emits the data to the subscribers using Observable
 */
object RxBus {
    /*private val publisher = PublishSubject.create<Any>()
    fun publish(event: Any) {
        publisher.onNext(event)
    }

    // Listen should return an Observable and not the publisher
    // Using ofType we filter only events that match that class type
    fun <T : Any> listen(eventType: Class<T>): Observable<T> = publisher.ofType(eventType)*/

}
