package com.github.steveice10.mc.protocol.data.game.item.component;

import com.github.steveice10.mc.protocol.data.game.item.component.type.IntDataComponent;
import io.netty.buffer.ByteBuf;

import java.io.IOException;

public class IntComponentType extends DataComponentType<Integer> {
    private final IntReader primitiveReader;
    private final IntWriter primitiveWriter;
    private final IntDataComponentFactory primitiveFactory;

    protected IntComponentType(IntReader reader, IntWriter writer, IntDataComponentFactory metadataFactory) {
        super(reader, writer, metadataFactory);

        this.primitiveReader = reader;
        this.primitiveWriter = writer;
        this.primitiveFactory = metadataFactory;
    }

    @Override
    public DataComponent<Integer, IntComponentType> readDataComponent(ItemCodecHelper helper, ByteBuf input) throws IOException {
        return this.primitiveFactory.createPrimitive(this, this.primitiveReader.readPrimitive(helper, input));
    }

    public void writeDataComponentPrimitive(ItemCodecHelper helper, ByteBuf output, int value) throws IOException {
        this.primitiveWriter.writePrimitive(helper, output, value);
    }

    @FunctionalInterface
    public interface IntReader extends Reader<Integer> {
        int readPrimitive(ItemCodecHelper helper, ByteBuf input) throws IOException;

        @Deprecated
        @Override
        default Integer read(ItemCodecHelper helper, ByteBuf input) throws IOException {
            return this.readPrimitive(helper, input);
        }
    }

    @FunctionalInterface
    public interface IntWriter extends Writer<Integer> {
        void writePrimitive(ItemCodecHelper helper, ByteBuf output, int value) throws IOException;

        @Deprecated
        @Override
        default void write(ItemCodecHelper helper, ByteBuf output, Integer value) throws IOException {
            this.writePrimitive(helper, output, value);
        }
    }

    @FunctionalInterface
    public interface IntDataComponentFactory extends DataComponentFactory<Integer> {
        IntDataComponent createPrimitive(IntComponentType type, int value);

        @Deprecated
        @Override
        default DataComponent<Integer, IntComponentType> create(DataComponentType<Integer> type, Integer value) {
            throw new UnsupportedOperationException("Unsupported read method! Use primitive createPrimitive!");
        }
    }
}
