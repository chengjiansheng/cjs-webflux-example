package com.cjs.example.restservice.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author ChengJianSheng
 * @date 2020-03-26
 */
public class Hello {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/chengjiansheng/Desktop/data.txt");
        FileChannel channel = fis.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(10);

        while (true) {
            if (channel.read(buffer) == -1) {
                break;
            }
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char)buffer.get());
            }
            buffer.clear();
        }

        channel.close();
        fis.close();
    }
}
