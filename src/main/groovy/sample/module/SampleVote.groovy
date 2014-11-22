package sample.module

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import groovy.transform.Canonical
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy


/**
 * Created by tolkv on 11/23/2014.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Canonical
public class SampleVote {
    @JsonProperty('name')
    String name='Hello'
    @JsonProperty
    String reason='i do'
    Integer value
}
