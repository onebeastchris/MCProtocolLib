package com.github.steveice10.mc.protocol.data.game.item.component;

import com.github.steveice10.mc.protocol.data.game.item.component.type.BooleanDataComponent;
import io.netty.buffer.ByteBuf;

import java.io.IOException;

public class BooleanComponentType extends DataComponentType<Boolean> {
    private final BooleanReader primitiveReader;
    private final BooleanWriter primitiveWriter;
    private final BooleanDataComponentFactory primitiveFactory;

    protected BooleanComponentType(BooleanReader reader, BooleanWriter writer, BooleanDataComponentFactory metadataFactory) {
        super(reader, writer, metadataFactory);

        this.primitiveReader = reader;
        this.primitiveWriter = writer;
        this.primitiveFactory = metadataFactory;
    }

    @Override
    public DataComponent<Boolean, BooleanComponentType> readDataComponent(ItemCodecHelper helper, ByteBuf input) throws IOException {
        return this.primitiveFactory.createPrimitive(this, this.primitiveReader.readPrimitive(input));
    }

    public void writeDataComponentPrimitive(ByteBuf output, boolean value) throws IOException {
        this.primitiveWriter.writePrimitive(output, value);
    }

    @FunctionalInterface
    public interface BooleanReader extends BasicReader<Boolean> {
        boolean readPrimitive(ByteBuf input) throws IOException;

        @Deprecated
        @Override
        default Boolean read(ByteBuf input) throws IOException {
            return this.readPrimitive(input);
        }
    }

    @FunctionalInterface
    public interface BooleanWriter extends BasicWriter<Boolean> {
        void writePrimitive(ByteBuf output, boolean value) throws IOException;

        @Deprecated
        @Override
        default void write(ByteBuf output, Boolean value) throws IOException {
            this.writePrimitive(output, value);
        }
    }

    @FunctionalInterface
    public interface BooleanDataComponentFactory extends DataComponentFactory<Boolean> {
        BooleanDataComponent createPrimitive(BooleanComponentType type, boolean value);

        @Deprecated
        @Override
        default DataComponent<Boolean, BooleanComponentType> create(DataComponentType<Boolean> type, Boolean value) {
            throw new UnsupportedOperationException("Unsupported read method! Use primitive createPrimitive!");
        }
    }
}
