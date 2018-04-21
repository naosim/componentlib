package com.naosim.componentlib

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
@SpringBootTest
@TestConfiguration
class SampleComponentSpec extends Specification {
    @Autowired
    SampleComponent sut;

    def "test"() {
        expect:
        sut.hello() == "hello"
    }

}
