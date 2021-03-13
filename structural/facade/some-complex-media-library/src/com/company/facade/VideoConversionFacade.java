package com.company.facade;

import com.company.complex.*;

import java.io.File;

/*
 * We create a facade class to hide the framework's complexity
 * behind a simple interface. It's a trade-off between
 * functionality and simplicity.
 */

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");

        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extrac(file);
        Codec destionationCodec;

        if (format.equals("mp4"))
            destionationCodec = new OggCompressionCodec();
        else
            destionationCodec = new MPEG4CompressionCodec();

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destionationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);

        System.out.println("VideoConversionFacade: conversion completed.");

        return result;
    }
}
