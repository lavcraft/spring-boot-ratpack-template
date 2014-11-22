import sample.Application
import sample.module.Voter
import ratpack.spring.Spring

import static ratpack.groovy.Groovy.ratpack

ratpack {
    handlers {
        register(Spring.spring(Application.class))
        get { Voter v->
            render 'I am root sss' + v.vote()
        }

        get('test') {
            render 'hello wprl'
        }
    }
}


