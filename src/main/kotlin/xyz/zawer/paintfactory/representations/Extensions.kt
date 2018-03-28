package xyz.zawer.paintfactory.representations

import xyz.zawer.paintfactory.domain.entities.Bucket
import xyz.zawer.paintfactory.domain.entities.Color

fun ColorRepresentation.toColor() = Color(this.color)

fun Bucket.toBucketRepresentation() = BucketRepresentation(
        id = this.id.value,
        color = this.color.name
)

