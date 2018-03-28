package xyz.zawer.paintfactory.domain.commands

import br.com.zup.eventsourcing.core.Repository
import org.springframework.stereotype.Service
import xyz.zawer.paintfactory.domain.entities.Bucket

@Service
class CommandHandler(val repository: Repository<Bucket>) {

    fun createBucket(cmd: CreateBucket): Bucket {
        val bucket = Bucket(cmd.color)
        repository.save(bucket)
        return bucket
    }
}
