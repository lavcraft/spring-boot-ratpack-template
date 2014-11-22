package sample.module

import org.springframework.stereotype.Component

/**
 * Created by tolkv on 11/23/2014.
 */
@Component
class EchoBean {
    public String echo(String msg){
        return msg
    }
}
