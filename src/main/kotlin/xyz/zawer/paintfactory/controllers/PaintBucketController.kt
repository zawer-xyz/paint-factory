package xyz.zawer.paintfactory.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import xyz.zawer.paintfactory.domain.commands.CommandHandler
import xyz.zawer.paintfactory.domain.commands.CreateBucket
import xyz.zawer.paintfactory.representations.BucketRepresentation
import xyz.zawer.paintfactory.representations.ColorRepresentation
import xyz.zawer.paintfactory.representations.toBucketRepresentation
import xyz.zawer.paintfactory.representations.toColor

@RestController()
class PaintBucketController(val commandHandler: CommandHandler) {

    @PostMapping(path = ["/bucket"])
    fun createBucket(@RequestBody color: ColorRepresentation) : BucketRepresentation {
        val cmd = CreateBucket(color.toColor())
        return commandHandler.createBucket(cmd).toBucketRepresentation()
    }
}
