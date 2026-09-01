package com.theendercore.dusks.screenshots.mixin.client;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.Screenshot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.io.File;

@Mixin(Screenshot.class)
public class ScreenshotMixin {

    @ModifyExpressionValue(method = "method_1664", at = @At(value = "INVOKE", target = "Ljava/io/File;getAbsolutePath()Ljava/lang/String;"))
    private static String run2(String original, @Local(argsOnly = true) File file) {
        return file.getParent();
    }

}
