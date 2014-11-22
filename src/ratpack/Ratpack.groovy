import ratpack.spring.Spring
import sample.Application
import sample.module.Voter

import static ratpack.groovy.Groovy.ratpack

ratpack {
    bindings {

    }

    handlers {
//        register(Spring.spring(Application.class))
        get {
            response.send 'Hello world :222s ::sss '
        }

        get('test') {
            response.send  'hello wprl'
        }

        assets 'public'
    }
}


