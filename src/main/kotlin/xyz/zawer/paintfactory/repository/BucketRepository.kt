package xyz.zawer.paintfactory.repository

import br.com.zup.eventsourcing.eventstore.EventStoreRepository
import org.springframework.stereotype.Component
import xyz.zawer.paintfactory.domain.entities.Bucket

@Component
class BucketRepository(): EventStoreRepository<Bucket>()
