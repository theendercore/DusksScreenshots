package com.theendercore.dusks.screenshots.client

import net.minecraft.resources.ResourceLocation
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object DusksScreenshotsClient {

    const val MODID = "dusks_screenshots"

    @JvmField
    val log: Logger = LoggerFactory.getLogger(MODID)


    fun init() {
        log.info("Hello from Client")
    }

    fun id(namespace: String, path: String): ResourceLocation = ResourceLocation.fromNamespaceAndPath(namespace, path)
    fun mc(path: String): ResourceLocation = ResourceLocation.withDefaultNamespace(path)
    fun id(path: String) = id(MODID, path)

}