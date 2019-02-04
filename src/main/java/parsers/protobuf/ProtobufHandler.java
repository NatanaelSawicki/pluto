package parsers.protobuf;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.protobuf.ProtobufMapper;
import com.fasterxml.jackson.dataformat.protobuf.schema.NativeProtobufSchema;
import com.fasterxml.jackson.dataformat.protobuf.schema.ProtobufSchema;
import com.fasterxml.jackson.dataformat.protobuf.schema.ProtobufSchemaLoader;
import customexceptions.PlutoAvroMappingException;
import customexceptions.PlutoIOException;
import exception.ExceptionHandler;
import java.io.IOException;

public class ProtobufHandler {

    public static String createProtobufSchema(Class clazz)
            throws PlutoAvroMappingException {
        try {
            ProtobufMapper mapper = new ProtobufMapper();
            ProtobufSchema schemaWrapper = mapper.generateSchemaFor(clazz);
            NativeProtobufSchema nativeProtobufSchema = schemaWrapper.getSource();
            return nativeProtobufSchema.toString();
        } catch (JsonMappingException ex) {
            throw new PlutoAvroMappingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public static byte[] toProtobuf(String protobufSchema,
            Object param) 
            throws PlutoIOException {
        ProtobufSchema schema;
        try {
            schema = ProtobufSchemaLoader.std.parse(protobufSchema);
            return new ProtobufMapper().writer(schema).writeValueAsBytes(param);
        } catch (IOException ex) {
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        }

    }

}
