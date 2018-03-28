package xyz.zawer.paintfactory.domain.events

import br.com.zup.eventsourcing.core.Event
import xyz.zawer.paintfactory.domain.entities.Color

class BucketCreated(val bucketId: String, val color: Color ) : Event()
