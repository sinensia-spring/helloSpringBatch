package com.test.batch;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

@Log
public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person input) throws Exception {
        Person output = new Person();
        output.setId(input.getId());
        output.setFirstName(input.getFirstName().toUpperCase());
        output.setLastName(input.getLastName().toUpperCase());
        output.setEmail(input.getEmail());
        output.setAge(input.getAge());
        log.info("Converted "+input+" to "+output);
        return output;
    }
}
