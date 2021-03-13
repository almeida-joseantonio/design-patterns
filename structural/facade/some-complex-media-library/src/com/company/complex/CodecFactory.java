package com.company.complex;

public class CodecFactory {
    public static Codec extrac(VideoFile file) {
        String type = file.getCodecType();

        if (type.equals("mpg")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
