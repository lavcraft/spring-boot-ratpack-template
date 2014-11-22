package sample.module

import com.google.inject.AbstractModule
import groovy.transform.CompileStatic

/**
 * Created by tolkv on 11/22/2014.
 */
@CompileStatic
class SpringModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Voter).to(SomeBean)
    }
}
