package xyz.zawer.paintfactory.domain.entities

import br.com.zup.eventsourcing.core.AggregateId
import br.com.zup.eventsourcing.core.AggregateRoot
import br.com.zup.eventsourcing.core.Event
import xyz.zawer.paintfactory.domain.events.BucketCreated
import java.util.*

class Bucket() : AggregateRoot() {

    lateinit var color: Color

    override fun applyEvent(event: Event) {
        this.event = event
        when (event) {
            is BucketCreated -> apply(event)
        }
    }

    constructor(color: Color): this(){
        applyChange(BucketCreated(UUID.randomUUID().toString(), color))
    }

    fun apply(event: BucketCreated){
        id = AggregateId(event.bucketId)
        color = event.color
    }
}
