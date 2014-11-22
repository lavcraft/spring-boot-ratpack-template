import ratpack.jackson.JacksonModule
import ratpack.spring.Spring
import sample.Application
import sample.module.EchoBean
import sample.module.Voter

import static ratpack.groovy.Groovy.ratpack
import static ratpack.jackson.Jackson.json

ratpack {
    bindings {
        add new JacksonModule()
    }

    handlers {
        register(Spring.spring(Application.class))
        get { Voter v ->
            render json(v.vote())
        }

        prefix('echo') {
            get { EchoBean echo ->
                render echo.echo('hello: nothingss')
            }
            get(':phrase') { EchoBean echo ->
                render echo.echo('hello: ' + pathTokens.phrase)
            }
        }
    }
}


