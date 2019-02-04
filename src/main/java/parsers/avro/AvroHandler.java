package parsers.avro;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.AvroMapper;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;
import customexceptions.PlutoAvroMappingException;
import customexceptions.PlutoAvroProcessingException;
import customexceptions.PlutoIOException;
import exception.ExceptionHandler;
import java.io.IOException;
import org.apache.avro.Schema;

public class AvroHandler {

    public static String generateAvroSchema(Object param)
            throws PlutoAvroMappingException {
        try {
            ObjectMapper mapper = new ObjectMapper(new AvroFactory());
            AvroSchemaGenerator gen = new AvroSchemaGenerator();
            mapper.acceptJsonFormatVisitor(Object.class, gen);
            AvroSchema schemaWrapper = gen.getGeneratedSchema();
            Schema avroSchema = schemaWrapper.getAvroSchema();
            return avroSchema.toString();
        } catch (JsonMappingException ex) {
            throw new PlutoAvroMappingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static byte[] toAvro(Object param) 
            throws PlutoAvroMappingException, 
            PlutoAvroProcessingException{
        AvroMapper avroMapper = new AvroMapper();
        try {
            AvroSchema avroSchema = new AvroSchema(new Schema.Parser()
                    .setValidate(true)
                    .parse(generateAvroSchema(param)));
            return avroMapper.writer(avroSchema)
                    .writeValueAsBytes(param);
        } catch (PlutoAvroMappingException ex) {
            throw new PlutoAvroMappingException(ExceptionHandler.getExceptionDetails(ex));
        } catch (JsonProcessingException ex) {
            throw new PlutoAvroProcessingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

    public static Object fromAvro(String schema,
            String avro,
            byte[] content)
            throws PlutoIOException {
        Schema schemaFromString = new Schema.Parser().setValidate(true).parse(schema);
        AvroSchema avroSchema = new AvroSchema(schemaFromString);
        AvroMapper avroMapper = new AvroMapper();
        try {
            return avroMapper.reader(Object.class)
                    .with(avroSchema)
                    .readValue(content);
        } catch (IOException ex) {
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }

}
